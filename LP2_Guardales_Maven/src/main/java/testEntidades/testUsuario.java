package testEntidades;

import java.util.List;
import model.TblUsuariocl2;
import daoImplement.UsuarioImpl;

public class testUsuario {

	public static void main(String[] args) {
		// INSTANCIAMOS
		TblUsuariocl2 userEntity = new TblUsuariocl2();
		UsuarioImpl userDao = new UsuarioImpl();

		//REGISTRAR USUARIO ----------------------------------
		/*userEntity.setUsuario("Luis");
		userEntity.setPassword("303");
		
		userDao.RegistrarUsuario(userEntity);
		
		System.out.println("Dato registrado en la BD");*/
		
		//ACTUALIZAR USUARIO ----------------------------------
		/*userEntity.setIdUsuario(7);
		userEntity.setUsuario("Peter");
		userEntity.setPassword("804");
		
		userDao.ActualizarUsuario(userEntity);
		
		System.out.println("Dato actualizado en la BD");*/
		
		//ELIMINAR USUARIO ----------------------------------
		/*userEntity.setIdUsuario(6);
		
		userDao.EliminarUsuario(userEntity);
		
		System.out.println("Dato eliminado de la BD");*/
		
		//LISTAR USUARIO ----------------------------------
		/*List<TblUsuariocl2> listado = userDao.ListarUsuario();
		for(TblUsuariocl2 lis:listado){
			System.out.println("Id \t"+lis.getIdUsuario()+"\n"+
								"Usuario "+lis.getUsuario()+"\n"+
								"Clave \t"+lis.getPassword()+"\n \n");
		}*/
		
		//BUSCAR USUARIO ----------------------------------
		/*userEntity.setIdUsuario(2);
		
		TblUsuariocl2 us = userDao.BuscarUsuario(userEntity);
		
		System.out.println("Id \t"+us.getIdUsuario()+"\n"+
				"Usuario "+us.getUsuario()+"\n"+
				"Clave \t"+us.getPassword()+"\n \n");
		*/
	}

}
