package daoImplement;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.TblProveedorcl2;
import interfaces.IProveedor;

public class ProveedorImpl implements IProveedor{
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("LP2_Guardales_Maven");
	EntityManager em=emf.createEntityManager();

	@Override
	public void RegistrarProveedor(TblProveedorcl2 proveed) {
		try{
			em.getTransaction().begin();
			
			em.persist(proveed);
			
			em.getTransaction().commit();
			
	     }catch(RuntimeException ex){
	    	ex.getMessage(); 
	    	
	     }finally{
			em.close();
	     }		
		
	} //FIN M�TODO REGISTRAR ------------------------------------------------------------------------

	@Override
	public void ActualizarProveedor(TblProveedorcl2 proveed) {
		try{
			em.getTransaction().begin();
			
			em.merge(proveed);
			
			em.getTransaction().commit();
			
	     }catch(RuntimeException ex){
	    	ex.getMessage(); 
	    	
	     }finally{
			em.close();
	     }	
		
	} //FIN M�TODO ACTUALIZAR ------------------------------------------------------------------------

	@Override
	public void EliminarProveedor(TblProveedorcl2 proveed) {
		try {
			 em.getTransaction().begin();
			 
			 TblProveedorcl2 eliminarProv = em.find(TblProveedorcl2.class,proveed.getIdProveedor());
			 
			 if(eliminarProv !=null){
				 em.remove(eliminarProv);
				 
				 em.getTransaction().commit();
			 }
			 
		} catch (RuntimeException e) {
			e.getMessage();
			
		}finally {
			em.close();
		}
		
	} //FIN M�TODO ELIMINAR ------------------------------------------------------------------------

	@Override
	public List<TblProveedorcl2> ListarProveedor() {
		List<TblProveedorcl2> listado = null;
		
		try {
			em.getTransaction().begin();

			listado=em.createQuery("select c from TblProveedorcl2 c",TblProveedorcl2.class).getResultList();
		
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
	public TblProveedorcl2 BuscarProveedor(TblProveedorcl2 proveed) {
		TblProveedorcl2  provBuscado =null;
		
		try{
			em.getTransaction().begin();
			
			provBuscado=em.find(TblProveedorcl2.class,proveed.getIdProveedor());
			
			em.getTransaction().commit();
		
		}catch(RuntimeException e){
			e.getMessage();
			
		}finally {
			em.close();
		}
		
		return provBuscado;
	} //FIN M�TODO BUSCAR ------------------------------------------------------------------------

}
