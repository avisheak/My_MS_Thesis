package queries;

import javax.naming.OperationNotSupportedException;

import org.apache.jena.query.Dataset;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.ResultSet;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.tdb.TDBFactory;
import org.apache.jena.tdb.TDBLoader;
import org.apache.jena.tdb.transaction.DatasetGraphTransaction;

public class LoaderMain {
	// private static final String TDB_DIRECTORY = "C:\\Users\\Amrit\\Documents\\TDB";

	public String loadFile(String filePath, String outputDir) {
		String[] file = new String[] { filePath };
		@SuppressWarnings("unused")
		Model mod1 = createModel(outputDir);
		
		try {
			bulkload(outputDir, file);
		} catch (Exception e) {
			// TODO: handle exception
			return "Operation Failed";
		}
		
		return "Success. Data has been updated to TDB.";
	}

	public static ResultSet queryGraph(String sparql, String graph, String dbDir) throws Exception {
		Query query = QueryFactory.create(sparql, graph);
		return query(query, dbDir);
	}

	public static Model createModel(String... dbDirs) {
		Model mainModel = null;
		Dataset dataset = null;
		for (String dbDir : dbDirs) {
			dataset = TDBFactory.createDataset(dbDir);
			if (mainModel == null) {
				mainModel = dataset.getDefaultModel();
			} else {
				Model secondaryModel = dataset.getDefaultModel();
				mainModel = ModelFactory.createUnion(mainModel, secondaryModel);
			}
		}
		mainModel = ModelFactory.createRDFSModel(mainModel);
		return mainModel;
	}

	public static ResultSet query(Query query, String... dbDirs) throws OperationNotSupportedException {
		Model mainModel = createModel(dbDirs);
		return query(query, mainModel);
	}

	public static ResultSet query(String sparql, String... dbDirs) throws OperationNotSupportedException {
		Model model = createModel(dbDirs);
		Query query = QueryFactory.create(sparql);
		return query(query, model);
	}

	public static ResultSet query(String sparql, Model model) throws OperationNotSupportedException {
		Query query = QueryFactory.create(sparql);
		return query(query, model);
	}

	public static ResultSet query(Query query, Model model) {
		@SuppressWarnings("unused")
		QueryExecution qe = QueryExecutionFactory.create(query, model);
		ResultSet results = null;
		/*if (query.isSelectType()) {
			results = qe.execSelect();
		} else if (query.isDescribeType()) {
			Iterator<Triple> triples = qe.execDescribeTriples();
			results = new TripleResultSet(triples, model);
		} else if (query.isConstructType()) {
			Iterator<Triple> triples = qe.execConstructTriples();
			results = new TripleResultSet(triples, model);
		} else if (query.isAskType()) {
			Boolean answer = qe.execAsk();
			List<Boolean> result = new ArrayList<Boolean>();
			result.add(answer);
			results = new BooleanResultSet(result.iterator(), model);
		}*/
		return results;
	}

	/**
	 * Load a list of files into a database located in a given directory.
	 * 
	 * @param dir  directory containing the database file.
	 * @param urls URLs of the files containing the RDF content to be loaded into
	 *             the database file.
	 */
	public static void bulkload(String dir, String[] urls) {
		DatasetGraphTransaction dataset = (DatasetGraphTransaction) TDBFactory.createDatasetGraph(dir);
		for (String i : urls) {
			TDBLoader.load(dataset.getDatasetGraphToQuery(), i);
		}
	}

	/**
	 * Query a given KBox endpoint.
	 * 
	 * @param sparql  a valid SPARQL query.
	 * @param address the ServerAddress of the service that will be queried.
	 * @return an ResultSet containing the elements retrieved by the given SPARQL
	 *         query.
	 * @throws MalformedURLException
	 *//*
		 * public static ResultSet queryService(String sparql, ServerAddress address) {
		 * QueryExecution qe = QueryExecutionFactory.sparqlService(
		 * address.getQueryURL(), sparql); ResultSet results = qe.execSelect(); return
		 * results; }
		 */
}
