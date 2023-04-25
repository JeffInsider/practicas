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
import modelos.Socios;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Nico
 */
public class SociosServicios {
    
    private static Document documento;
    public ArrayList<Socios> socios;
    
    public static void guardarXML(){
        try {
            Transformer transformador = TransformerFactory.newInstance().newTransformer();
            transformador.setOutputProperty(OutputKeys.INDENT, "yes");
            Result entrada = new StreamResult(new File("src/servicios/Socios.xml"));
            Source salida = new DOMSource(documento);
            transformador.transform(salida, entrada);
            
        } catch (Exception e) {
            System.out.println("Error al guardar");
        }
    }
    
    public static void leerXML(){
        try {
            File archivoSocio = new File("src/servicios/Socios.xml");
            
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            
            documento = builder.parse(archivoSocio);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void agregarSocio(Socios socio){
        leerXML();
        
        Element principal = documento.getDocumentElement();
        Element datos = documento.createElement("socio");
        
        Attr id = documento.createAttribute("id");
        id.setValue(String.valueOf(socio.getId()));
        datos.setAttributeNode(id);
        
        Attr nombre = documento.createAttribute("nombre");
        nombre.setValue(socio.getNombre());
        datos.setAttributeNode(nombre);
        
        Attr dni = documento.createAttribute("DNI");
        dni.setValue(socio.getDni());
        datos.setAttributeNode(dni);
        
        Attr direccion = documento.createAttribute("direccion");
        direccion.setValue(socio.getDireccion());
        datos.setAttributeNode(direccion);
        
        Attr tel = documento.createAttribute("telefono");
        tel.setValue(socio.getTel());
        datos.setAttributeNode(tel);
        
        Attr email = documento.createAttribute("email");
        email.setValue(socio.getEmail());
        datos.setAttributeNode(email);
        
        principal.appendChild(datos);
        guardarXML();
    }
    
    public String[] columnasNombres = {
        "Id",
        "Nombre",
        "DNI",
        "Direccion",
        "Telefono",
        "Email"
    };
    
    public static ArrayList<Socios> mostrarSocios(String buscar){
        ArrayList<Socios> sociosFiltro = new ArrayList<>();
        try {
            Socios socio = new Socios();
            File archivoSocios = new File ("src/servicios/Socios.xml");
            
            DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document documento = builder.parse(archivoSocios);
            
            documento.getDocumentElement().normalize();
            
            NodeList nodeLista = documento.getElementsByTagName("socio");
            
            for (int i = 0; i < nodeLista.getLength(); i++) {
                Node nDato = nodeLista.item(i);
                
                if (nDato.getNodeType() == Node.ELEMENT_NODE) {
                    Element eDato = (Element) nDato;
                    
                    if (buscar.isEmpty()) {
                        int id = Integer.parseInt(eDato.getAttribute("id"));
                        String nombre = eDato.getAttribute("nombre");
                        String dni = eDato.getAttribute("DNI");
                        String dirección = eDato.getAttribute("direccion");
                        String tel = eDato.getAttribute("telefono");
                        String email = eDato.getAttribute("email");
                        
                        {
                            socio = new Socios(id, nombre, dni, dirección, tel, email);
                        }
                        
                        sociosFiltro.add(socio);
                        
                    } else if(eDato.getAttribute("id").equals(buscar)){
                        {
                            socio = new Socios(Integer.parseInt(
                                    eDato.getAttribute("id")),
                                    eDato.getAttribute("nombre"),
                                    eDato.getAttribute("DNI"),
                                    eDato.getAttribute("direccion"),
                                    eDato.getAttribute("telefono"),
                                    eDato.getAttribute("email"));
                            sociosFiltro.add(socio);
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        
        return sociosFiltro;
    }
    
    public static Socios getSocios(String id){
    
        Socios socio = new Socios();
        leerXML();
        
        NodeList nodeLista = documento.getElementsByTagName("socio");
        
        for (int i = 0; i < nodeLista.getLength(); i++) {
            Node nDato = nodeLista.item(i);
            
            if (nDato.getNodeType() == Node.ELEMENT_NODE) {
                Element eDato = (Element) nDato;
                
                if (eDato.getAttribute("id").equals(id)) {
                    {
                        socio = new Socios(
                                Integer.parseInt(
                                        eDato.getAttribute("id")), 
                                eDato.getAttribute("nombre"),
                                eDato.getAttribute("DNI"),
                                eDato.getAttribute("direccion"),
                                eDato.getAttribute("telefono"),
                                eDato.getAttribute("email"));
                    }
                }
            }
        }
        return socio;
    }
    
    public static boolean actualizarSocios(Socios socio){
    
        int id = socio.getId();
        leerXML();
        
        NodeList nodeLista = documento.getElementsByTagName("socio");
        
        for (int i = 0; i < nodeLista.getLength(); i++) {
            Node nDatos = nodeLista.item(i);
            
            if(nDatos.getNodeType() == Node.ELEMENT_NODE){
                Element eDatos =(Element) nDatos;
                
                int Id = Integer.parseInt(eDatos.getAttribute("id"));
                
                if(Id == id){
                    eDatos.setAttribute("nombre", socio.getNombre());
                    eDatos.setAttribute("DNI", socio.getDni());
                    eDatos.setAttribute("direccion", socio.getDireccion());
                    eDatos.setAttribute("telefono", socio.getTel());
                    eDatos.setAttribute("Email", socio.getEmail());
                    break;
                }
            }
        }
        guardarXML();
        return true;
    }
    
    public static boolean eliminarSocio(String id){
        leerXML();
    
        Element principal = documento.getDocumentElement();
        NodeList nodeLista = documento.getElementsByTagName("socio");
        
        for (int i = 0; i < nodeLista.getLength(); i++) {
            Node nDatos = nodeLista.item(i);
            
            if(nDatos.getNodeType() == Node.ELEMENT_NODE){
                Element eDatos = (Element) nDatos;
                
                if(eDatos.getAttribute("id").equals(id)){
                    principal.removeChild(nDatos);
                    break;
                }
            }
        }
        
        guardarXML();
        return true;
    }
}
