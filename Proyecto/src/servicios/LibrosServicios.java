package servicios;

import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import modelos.Libros;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 *
 * @author Nico
 */
public class LibrosServicios {
    
    private static Document documento;
   private ArrayList<Libros> libros;
   
   public static void guardarXML(){
       try{
           Transformer transformador = 
                   TransformerFactory.newInstance().newTransformer();
           transformador.setOutputProperty(OutputKeys.INDENT, "yes");
           Result entrada = new 
                    StreamResult(new File("src/servicios/Libros.xml"));
           Source salida = new DOMSource(documento);
           transformador.transform(salida, entrada);
       } catch(Exception e){
           System.out.println("Error al guardar el archivo");
       }
   }
   
   public static void leerXML(){
       try {
           File archivoLibro = new File("src/servicios/Libros.xml");
           
           DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
           DocumentBuilder builder = factory.newDocumentBuilder();
           
           documento = builder.parse(archivoLibro);
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
   
   public static void agregarLibro(Libros libro){
       leerXML();
       
       Element principal = documento.getDocumentElement();
       Element datos = documento.createElement("libro");
       
       Attr codigo = documento.createAttribute("codigo");
       codigo.setValue(String.valueOf(libro.getCodigo()));
       datos.setAttributeNode(codigo);
       
       Attr titulo = documento.createAttribute("titulo");
       titulo.setValue(libro.getTitulo());
       datos.setAttributeNode(titulo);
       
       Attr autor = documento.createAttribute("autor");
       autor.setValue(libro.getAutor());
       datos.setAttributeNode(autor);
       
       Attr genero = documento.createAttribute("genero");
       genero.setValue(libro.getGenero());
       datos.setAttributeNode(genero);
       
       Attr dis = documento.createAttribute("disponibilidad");
        dis.setValue(libro.isDisponible());
        datos.setAttributeNode(dis);
        
        principal.appendChild(datos);
        guardarXML();
   }
   
   public String[] columnasNombres = {
       "Codigo",
       "Titulo",
       "Autor",
       "Genero",
       "Disponibilidad"
   };
   
   public static ArrayList<Libros> mostrarLibros(String buscar){
       ArrayList<Libros> librosFiltro = new ArrayList<>();
       try {
           Libros libro = new Libros();
           File archivoLibro = new File("src/servicios/Libros.xml");
           
           DocumentBuilderFactory factory 
                   = DocumentBuilderFactory.newDefaultInstance();
           DocumentBuilder builder = factory.newDocumentBuilder();
           Document documento = builder.parse(archivoLibro);
           
           documento.getDocumentElement().normalize();
           
           NodeList nodeLista = documento.getElementsByTagName("libro");
           
           for (int i = 0; i < nodeLista.getLength(); i++) {
               Node nDato = nodeLista.item(i);
               
               if (nDato.getNodeType() == Node.ELEMENT_NODE) {
                   Element eDato = (Element) nDato;
                   
                   if(buscar.isEmpty()){
                       int codigo = Integer.parseInt
                                           (eDato.getAttribute("codigo"));
                       String titulo = eDato.getAttribute("titulo");
                       String autor = eDato.getAttribute("autor");
                       String genero = eDato.getAttribute("genero");
                       String disponible = 
                               eDato.getAttribute("disponibilidad");
                       
                       {
                           libro = new Libros
                                    (codigo, titulo, autor, genero, disponible);
                       }
                       
                       librosFiltro.add(libro);
                   } else if (eDato.getAttribute("codigo").equals(buscar)){
                       {
                        libro = new Libros(Integer.parseInt(
                                    eDato.getAttribute("codigo")),
                                    eDato.getAttribute("titulo"),
                                    eDato.getAttribute("autor"),
                                    eDato.getAttribute("genero"),
                                    eDato.getAttribute("disponibilidad")
                            );
                        librosFiltro.add(libro);
                       } 
                   }
               }
           }
           
       } catch (Exception e) {
           System.out.println("Error");
       }
       return librosFiltro;
   }
   
   public static Libros getLibros(String codigo){
       Libros libros = new Libros();
       leerXML();
       
       NodeList nodeLista = documento.getElementsByTagName("libro");
       
       for (int i = 0; i < nodeLista.getLength(); i++) {
           Node nDato = nodeLista.item(i);
           
           if (nDato.getNodeType() == Node.ELEMENT_NODE) {
               Element eDato = (Element) nDato;
               
               if (true) {
                   {
                       libros = new Libros(
                               Integer.parseInt(eDato.getAttribute("codigo")),
                               eDato.getAttribute("titulo"),
                               eDato.getAttribute("autor"),
                               eDato.getAttribute("genero"),
                               eDato.getAttribute("disponibilidad")
                       );
                   }
               }
           }
       }
       
       return libros;
   }
   
   public static boolean actualizarLibros(Libros libro){
       int id = libro.getCodigo();
       leerXML();
       
       NodeList nodeLista = documento.getElementsByTagName("libro");
       
       for (int i = 0; i < nodeLista.getLength(); i++) {
           Node nDatos = nodeLista.item(i);
           
           if (nDatos.getNodeType() == Node.ELEMENT_NODE) {
               Element eDatos = (Element) nDatos;
               
               int codi = Integer.parseInt(eDatos.getAttribute("codigo"));
               
               if (codi == id) {
                   eDatos.setAttribute("titulo", libro.getTitulo());
                   eDatos.setAttribute("autor", libro.getAutor());
                   eDatos.setAttribute("genero", libro.getGenero());
                   eDatos.setAttribute("disponibilidad", libro.isDisponible());
                   break;
               }
           }
       }
       
       guardarXML();
       return true;
   }
   
   public static boolean eliminarLibro(String codigo){
   
       leerXML();
       
       Element principal = documento.getDocumentElement();
       NodeList nodeLista = documento.getElementsByTagName("libro");
       
       for (int i = 0; i < nodeLista.getLength(); i++) {
           Node nDatos = nodeLista.item(i);
           
           if(nDatos.getNodeType() == Node.ELEMENT_NODE){
               Element eDatos = (Element) nDatos;
               
               if(eDatos.getAttribute("codigo").equals(codigo)){
                   principal.removeChild(nDatos);
                   break;
               }
           }
       }
       
       guardarXML();
       return true;
   }
}
