/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

//import DAO.DAOLogin;
/**
 *Clase que controla el acceso a login
 * @author Gabriela Delgado
 */

//implements DAOLogin

public class ControladorLogin{
    
    //Creacion de variables 
    
    // Variable que se utiliza para guardar el estado de ControladorLogin
    private static ControladorLogin controladorLogin;
    
    //Creación de variable usuario de tipo privado y String
    private String usuario;
    
    //Creación de variable usuario de tipo privado y String
    private String contrasenia;

    public ControladorLogin() {
       
    }
    
    // Metodo utilizado para retornar una instancia de la clase
    public static ControladorLogin getControlaodrLogin(){
        if (controladorLogin == null)
            controladorLogin = new ControladorLogin();
        
        return controladorLogin;
    }
    
    //Metodo para verificar el inicio de secion
    public boolean VerificarUsuarios(String usuario, String contrasenia) {
        
        boolean estado = false;
        
        if ((usuario.equals("Gabriela"))&&(contrasenia.equals("12345")))
            estado = true;
           return estado;
        
        
    }

    // Este metodo recibe el parametro de usuario
    public String getUsuario() {
       return this.usuario;
    }

    // Este metodo recibe el parametro de contraseña
    public boolean CambiarContrasenia(String contrasenia) {
        
        boolean estado = true;
        this.contrasenia = contrasenia;
        return estado;
            
    }
    
}
