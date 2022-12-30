package Controladores.RepositoriosProfesor;

import Flyweight.AlumnoFlyweight;
import Flyweight.AlumnoFlyweightMain;
import Modelos.Alumno;
import com.mongodb.MongoNamespace;
import com.mongodb.ReadConcern;
import com.mongodb.ReadPreference;
import com.mongodb.WriteConcern;
import com.mongodb.bulk.BulkWriteResult;
import com.mongodb.client.*;
import com.mongodb.client.model.*;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import com.mongodb.session.ClientSession;
import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static com.mongodb.client.model.Filters.eq;

public class AlumnoRepositorioImpl implements AlumnoRepositorio {

    Alumno objCli = new Alumno();

    private static final String COLLECTION_NAME = "alumnos";
    private static final FindOneAndReplaceOptions UPDATE_OPTIONS = new FindOneAndReplaceOptions()
            .returnDocument(ReturnDocument.AFTER);

    //private final MongoCollection<Alumno> alumnos;
    private MongoCollection<Alumno> alumnos = new MongoCollection<Alumno>() {
        @Override
        public MongoNamespace getNamespace() {
            return null;
        }

        @Override
        public Class<Alumno> getDocumentClass() {
            return null;
        }

        @Override
        public CodecRegistry getCodecRegistry() {
            return null;
        }

        @Override
        public ReadPreference getReadPreference() {
            return null;
        }

        @Override
        public WriteConcern getWriteConcern() {
            return null;
        }

        @Override
        public ReadConcern getReadConcern() {
            return null;
        }

        @Override
        public <NewTDocument> MongoCollection<NewTDocument> withDocumentClass(Class<NewTDocument> clazz) {
            return null;
        }

        @Override
        public MongoCollection<Alumno> withCodecRegistry(CodecRegistry codecRegistry) {
            return null;
        }

        @Override
        public MongoCollection<Alumno> withReadPreference(ReadPreference readPreference) {
            return null;
        }

        @Override
        public MongoCollection<Alumno> withWriteConcern(WriteConcern writeConcern) {
            return null;
        }

        @Override
        public MongoCollection<Alumno> withReadConcern(ReadConcern readConcern) {
            return null;
        }

        @Override
        public long count() {
            return 0;
        }

        @Override
        public long count(Bson filter) {
            return 0;
        }

        @Override
        public long count(Bson filter, CountOptions options) {
            return 0;
        }

        @Override
        public long count(ClientSession clientSession) {
            return 0;
        }

        @Override
        public long count(ClientSession clientSession, Bson filter) {
            return 0;
        }

        @Override
        public long count(ClientSession clientSession, Bson filter, CountOptions options) {
            return 0;
        }

        @Override
        public <TResult> DistinctIterable<TResult> distinct(String fieldName, Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public <TResult> DistinctIterable<TResult> distinct(String fieldName, Bson filter, Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public <TResult> DistinctIterable<TResult> distinct(ClientSession clientSession, String fieldName, Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public <TResult> DistinctIterable<TResult> distinct(ClientSession clientSession, String fieldName, Bson filter, Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public FindIterable<Alumno> find() {
            return null;
        }

        @Override
        public <TResult> FindIterable<TResult> find(Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public FindIterable<Alumno> find(Bson filter) {
            return null;
        }

        @Override
        public <TResult> FindIterable<TResult> find(Bson filter, Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public FindIterable<Alumno> find(ClientSession clientSession) {
            return null;
        }

        @Override
        public <TResult> FindIterable<TResult> find(ClientSession clientSession, Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public FindIterable<Alumno> find(ClientSession clientSession, Bson filter) {
            return null;
        }

        @Override
        public <TResult> FindIterable<TResult> find(ClientSession clientSession, Bson filter, Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public AggregateIterable<Alumno> aggregate(List<? extends Bson> pipeline) {
            return null;
        }

        @Override
        public <TResult> AggregateIterable<TResult> aggregate(List<? extends Bson> pipeline, Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public AggregateIterable<Alumno> aggregate(ClientSession clientSession, List<? extends Bson> pipeline) {
            return null;
        }

        @Override
        public <TResult> AggregateIterable<TResult> aggregate(ClientSession clientSession, List<? extends Bson> pipeline, Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public ChangeStreamIterable<Alumno> watch() {
            return null;
        }

        @Override
        public <TResult> ChangeStreamIterable<TResult> watch(Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public ChangeStreamIterable<Alumno> watch(List<? extends Bson> pipeline) {
            return null;
        }

        @Override
        public <TResult> ChangeStreamIterable<TResult> watch(List<? extends Bson> pipeline, Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public ChangeStreamIterable<Alumno> watch(ClientSession clientSession) {
            return null;
        }

        @Override
        public <TResult> ChangeStreamIterable<TResult> watch(ClientSession clientSession, Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public ChangeStreamIterable<Alumno> watch(ClientSession clientSession, List<? extends Bson> pipeline) {
            return null;
        }

        @Override
        public <TResult> ChangeStreamIterable<TResult> watch(ClientSession clientSession, List<? extends Bson> pipeline, Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public MapReduceIterable<Alumno> mapReduce(String mapFunction, String reduceFunction) {
            return null;
        }

        @Override
        public <TResult> MapReduceIterable<TResult> mapReduce(String mapFunction, String reduceFunction, Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public MapReduceIterable<Alumno> mapReduce(ClientSession clientSession, String mapFunction, String reduceFunction) {
            return null;
        }

        @Override
        public <TResult> MapReduceIterable<TResult> mapReduce(ClientSession clientSession, String mapFunction, String reduceFunction, Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public BulkWriteResult bulkWrite(List<? extends WriteModel<? extends Alumno>> requests) {
            return null;
        }

        @Override
        public BulkWriteResult bulkWrite(List<? extends WriteModel<? extends Alumno>> requests, BulkWriteOptions options) {
            return null;
        }

        @Override
        public BulkWriteResult bulkWrite(ClientSession clientSession, List<? extends WriteModel<? extends Alumno>> requests) {
            return null;
        }

        @Override
        public BulkWriteResult bulkWrite(ClientSession clientSession, List<? extends WriteModel<? extends Alumno>> requests, BulkWriteOptions options) {
            return null;
        }

        @Override
        public void insertOne(Alumno cliente) {

        }

        @Override
        public void insertOne(Alumno cliente, InsertOneOptions options) {

        }

        @Override
        public void insertOne(ClientSession clientSession, Alumno cliente) {

        }

        @Override
        public void insertOne(ClientSession clientSession, Alumno cliente, InsertOneOptions options) {

        }

        @Override
        public void insertMany(List<? extends Alumno> clientes) {

        }

        @Override
        public void insertMany(List<? extends Alumno> clientes, InsertManyOptions options) {

        }

        @Override
        public void insertMany(ClientSession clientSession, List<? extends Alumno> clientes) {

        }

        @Override
        public void insertMany(ClientSession clientSession, List<? extends Alumno> clientes, InsertManyOptions options) {

        }

        @Override
        public DeleteResult deleteOne(Bson filter) {
            return null;
        }

        @Override
        public DeleteResult deleteOne(Bson filter, DeleteOptions options) {
            return null;
        }

        @Override
        public DeleteResult deleteOne(ClientSession clientSession, Bson filter) {
            return null;
        }

        @Override
        public DeleteResult deleteOne(ClientSession clientSession, Bson filter, DeleteOptions options) {
            return null;
        }

        @Override
        public DeleteResult deleteMany(Bson filter) {
            return null;
        }

        @Override
        public DeleteResult deleteMany(Bson filter, DeleteOptions options) {
            return null;
        }

        @Override
        public DeleteResult deleteMany(ClientSession clientSession, Bson filter) {
            return null;
        }

        @Override
        public DeleteResult deleteMany(ClientSession clientSession, Bson filter, DeleteOptions options) {
            return null;
        }

        @Override
        public UpdateResult replaceOne(Bson filter, Alumno replacement) {
            return null;
        }

        @Override
        public UpdateResult replaceOne(Bson filter, Alumno replacement, UpdateOptions updateOptions) {
            return null;
        }

      
        @Override
        public UpdateResult replaceOne(ClientSession clientSession, Bson filter, Alumno replacement) {
            return null;
        }

        @Override
        public UpdateResult replaceOne(ClientSession clientSession, Bson filter, Alumno replacement, UpdateOptions updateOptions) {
            return null;
        }

    

        @Override
        public UpdateResult updateOne(Bson filter, Bson update) {
            return null;
        }

        @Override
        public UpdateResult updateOne(Bson filter, Bson update, UpdateOptions updateOptions) {
            return null;
        }

        @Override
        public UpdateResult updateOne(ClientSession clientSession, Bson filter, Bson update) {
            return null;
        }

        @Override
        public UpdateResult updateOne(ClientSession clientSession, Bson filter, Bson update, UpdateOptions updateOptions) {
            return null;
        }

      
        @Override
        public UpdateResult updateMany(Bson filter, Bson update) {
            return null;
        }

        @Override
        public UpdateResult updateMany(Bson filter, Bson update, UpdateOptions updateOptions) {
            return null;
        }

        @Override
        public UpdateResult updateMany(ClientSession clientSession, Bson filter, Bson update) {
            return null;
        }

        @Override
        public UpdateResult updateMany(ClientSession clientSession, Bson filter, Bson update, UpdateOptions updateOptions) {
            return null;
        }

       
      

      
        @Override
        public Alumno findOneAndDelete(Bson filter) {
            return null;
        }

        @Override
        public Alumno findOneAndDelete(Bson filter, FindOneAndDeleteOptions options) {
            return null;
        }

        @Override
        public Alumno findOneAndDelete(ClientSession clientSession, Bson filter) {
            return null;
        }

        @Override
        public Alumno findOneAndDelete(ClientSession clientSession, Bson filter, FindOneAndDeleteOptions options) {
            return null;
        }

        @Override
        public Alumno findOneAndReplace(Bson filter, Alumno replacement) {
            return null;
        }

        @Override
        public Alumno findOneAndReplace(Bson filter, Alumno replacement, FindOneAndReplaceOptions options) {
            return null;
        }

        @Override
        public Alumno findOneAndReplace(ClientSession clientSession, Bson filter, Alumno replacement) {
            return null;
        }

        @Override
        public Alumno findOneAndReplace(ClientSession clientSession, Bson filter, Alumno replacement, FindOneAndReplaceOptions options) {
            return null;
        }

        @Override
        public Alumno findOneAndUpdate(Bson filter, Bson update) {
            return null;
        }

        @Override
        public Alumno findOneAndUpdate(Bson filter, Bson update, FindOneAndUpdateOptions options) {
            return null;
        }

        @Override
        public Alumno findOneAndUpdate(ClientSession clientSession, Bson filter, Bson update) {
            return null;
        }

        @Override
        public Alumno findOneAndUpdate(ClientSession clientSession, Bson filter, Bson update, FindOneAndUpdateOptions options) {
            return null;
        }




      

        @Override
        public void drop() {

        }

        @Override
        public void drop(ClientSession clientSession) {

        }

        @Override
        public String createIndex(Bson keys) {
            return null;
        }

        @Override
        public String createIndex(Bson keys, IndexOptions indexOptions) {
            return null;
        }

        @Override
        public String createIndex(ClientSession clientSession, Bson keys) {
            return null;
        }

        @Override
        public String createIndex(ClientSession clientSession, Bson keys, IndexOptions indexOptions) {
            return null;
        }

        @Override
        public List<String> createIndexes(List<IndexModel> indexes) {
            return null;
        }

        @Override
        public List<String> createIndexes(List<IndexModel> indexes, CreateIndexOptions createIndexOptions) {
            return null;
        }

        @Override
        public List<String> createIndexes(ClientSession clientSession, List<IndexModel> indexes) {
            return null;
        }

        @Override
        public List<String> createIndexes(ClientSession clientSession, List<IndexModel> indexes, CreateIndexOptions createIndexOptions) {
            return null;
        }

        @Override
        public ListIndexesIterable<Document> listIndexes() {
            return null;
        }

        @Override
        public <TResult> ListIndexesIterable<TResult> listIndexes(Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public ListIndexesIterable<Document> listIndexes(ClientSession clientSession) {
            return null;
        }

        @Override
        public <TResult> ListIndexesIterable<TResult> listIndexes(ClientSession clientSession, Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public void dropIndex(String indexName) {

        }

        @Override
        public void dropIndex(String indexName, DropIndexOptions dropIndexOptions) {

        }

        @Override
        public void dropIndex(Bson keys) {

        }

        @Override
        public void dropIndex(Bson keys, DropIndexOptions dropIndexOptions) {

        }

        @Override
        public void dropIndex(ClientSession clientSession, String indexName) {

        }

        @Override
        public void dropIndex(ClientSession clientSession, Bson keys) {

        }

        @Override
        public void dropIndex(ClientSession clientSession, String indexName, DropIndexOptions dropIndexOptions) {

        }

        @Override
        public void dropIndex(ClientSession clientSession, Bson keys, DropIndexOptions dropIndexOptions) {

        }

        @Override
        public void dropIndexes() {

        }

        @Override
        public void dropIndexes(ClientSession clientSession) {

        }

        @Override
        public void dropIndexes(DropIndexOptions dropIndexOptions) {

        }

        @Override
        public void dropIndexes(ClientSession clientSession, DropIndexOptions dropIndexOptions) {

        }

        @Override
        public void renameCollection(MongoNamespace newCollectionNamespace) {

        }

        @Override
        public void renameCollection(MongoNamespace newCollectionNamespace, RenameCollectionOptions renameCollectionOptions) {

        }

        @Override
        public void renameCollection(ClientSession clientSession, MongoNamespace newCollectionNamespace) {

        }

        @Override
        public void renameCollection(ClientSession clientSession, MongoNamespace newCollectionNamespace, RenameCollectionOptions renameCollectionOptions) {

        }
    };

    public static List<Alumno>lista = new LinkedList();

    public AlumnoRepositorioImpl() {
    }

    public AlumnoRepositorioImpl(MongoDatabase database) {
        this.alumnos = database.getCollection(COLLECTION_NAME, Alumno.class);
    }

    @Override
    public void create(Alumno alumno) {

        //INGRESO VIA POSTMAN
        lista = new LinkedList<>(AlumnoFlyweightMain.alumnosFlyweight);

        System.out.println("entrando: " + alumno.toString());
        // cliente.setId((new ObjectId()).toString());

        //  System.out.println("\nCLIENTE REGISTRADO CORRECTAMENTE");
        //  System.out.println( objCli.imprimeDatosCliente(cliente));

        //INGRESO VIA GUI

        alumno.setDni((new ObjectId()).toString());
        alumno.setNombre(lista.get(lista.size()-1).getNombre());
        alumno.setApellido(lista.get(lista.size()-1).getApellido());

        ArrayList<String> notas = AlumnoFlyweightMain.alumnosFlyweight.get(AlumnoFlyweightMain.alumnosFlyweight.size()-1).getNotas();

        alumno.setAlumf(lista.get(lista.size()-1),new AlumnoFlyweight(notas));

        // clientes.insertOne(cliente); // PARA POSTMAN Y GUI

        // System.out.println("\nCLIENTE REGISTRADO CORRECTAMENTE");
        // System.out.println( objCli.imprimeDatosCliente(cliente));  //INGRESO VIA POSTMAN
        // System.out.println( objCli.imprimeDatosCliente(lista.get(lista.size()-1))); //INGRESO VIA GUI

        alumnos.insertOne(alumno);
    }

    @Override
    public void delete(String id) {
        alumnos.deleteOne(new Document("_id", id));
    }

    @Override
    public Alumno find(String id) {
        //System.out.println("_id: " + id);
        return alumnos.find(eq("_id", id)).first();
    }

    @Override
    public List<Alumno> findAll() {
        List<Alumno> result = new LinkedList<>();

        for (Alumno alumno : alumnos.find()) {
            //System.out.println("customer: " + customer);
            result.add(alumno);
        }

        return result;
    }

    @Override
    public Alumno update(Alumno post, String dni) {
        return alumnos.findOneAndReplace(new Document("dni", dni), post, UPDATE_OPTIONS);
    }

}
