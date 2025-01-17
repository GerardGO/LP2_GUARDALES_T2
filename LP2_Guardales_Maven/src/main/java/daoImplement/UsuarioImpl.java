package daoImplement;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.TblUsuariocl2;
import interfaces.IUsuario;

public class UsuarioImpl implements IUsuario{

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("LP2_Guardales_Maven");
	EntityManager em=emf.createEntityManager();
	
	@Override
	public void RegistrarUsuario(TblUsuariocl2 user) {
		try{
			em.getTransaction().begin();
			
			em.persist(user);
			
			em.getTransaction().commit();
			
	     }catch(RuntimeException ex){
	    	ex.getMessage(); 
	    	
	     }finally{
			em.close();
	     }
	} //FIN M�TODO REGISTRAR ------------------------------------------------------------------------

	
	@Override
	public void ActualizarUsuario(TblUsuariocl2 user) {
		try{
			em.getTransaction().begin();
			
			em.merge(user);
			
			em.getTransaction().commit();
			
	     }catch(RuntimeException ex){
	    	ex.getMessage(); 
	    	
	     }finally{
			em.close();
	     }
		
	} //FIN M�TODO ACTUALIZAR ------------------------------------------------------------------------

	@Override
	public void EliminarUsuario(TblUsuariocl2 user) {
		try {
			 em.getTransaction().begin();
			 
			 TblUsuariocl2 eliminarUser = em.find(TblUsuariocl2.class,user.getIdUsuario());
			 
			 if(eliminarUser !=null){
				 em.remove(eliminarUser);
				 
				 em.getTransaction().commit();
			 }
			 
		} catch (RuntimeException e) {
			e.getMessage();
			
		}finally {
			em.close();
		}
		
	} //FIN M�TODO ELIMINAR ------------------------------------------------------------------------

	@Override
	public List<TblUsuariocl2> ListarUsuario() {
		List<TblUsuariocl2> listado = null;
		
		try {
			em.getTransaction().begin();

			listado=em.createQuery("select c from TblUsuariocl2 c",TblUsuariocl2.class).getResultList();
		
			em.getTransaction().commit();
			
		}catch(RuntimeException ex){
			ex.getMessage();
		}
		finally {
			em.close();
		}
		
		return listado;
	} //FIN M�TODO LISTAR ------------------------------------------------------------------------

	@Override
	public TblUsuariocl2 BuscarUsuario(TblUsuariocl2 user) {
		TblUsuariocl2  userBuscado =null;
		
		try{
			em.getTransaction().begin();
			
			userBuscado=em.find(TblUsuariocl2.class,user.getIdUsuario());
			
			em.getTransaction().commit();
		
		}catch(RuntimeException e){
			e.getMessage();
			
		}finally {
			em.close();
		}
		
		return userBuscado;
	} //FIN M�TODO BUSCAR ------------------------------------------------------------------------

}
