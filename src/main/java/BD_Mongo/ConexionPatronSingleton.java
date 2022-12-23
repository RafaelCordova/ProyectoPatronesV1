package BD_Mongo;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;

public class ConexionPatronSingleton extends Mongo{

    //DECLARACIONES ESTATICAS PARA LA BD
    public static String host = "localhost";
    public static int port = 27017;

    static public ConexionPatronSingleton mongoClient = getInstance(host,port);
    static public DB db = mongoClient.getDB("Colegio");
    private static ConexionPatronSingleton instance = null;

    //DECLARACION DE NUESTRAS COLECCIONES A USAR
    static public DBCollection collection = db.getCollection("Profesores");
    static public DBCollection collection2 = db.getCollection("Alumnos");

    //CONSTRUCTOR PRIVADO P
    private ConexionPatronSingleton(String ip, int port) {
        super(ip, port);                                 }

    //PÁTRON SINGLETON PARA BLOQUEAR LA CREACION DE NUEVAS INSTANCIAS DE CLASE CONEXION
    public static ConexionPatronSingleton getInstance(String ip, int port) {
        if (instance == null){
            instance =  new ConexionPatronSingleton(ip,port);
                             }
        return instance;
                                                                                        }
                                                }