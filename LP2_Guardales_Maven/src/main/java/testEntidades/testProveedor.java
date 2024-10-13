package testEntidades;

import java.util.Date;
import java.util.List;
import model.TblProveedorcl2;
import daoImplement.ProveedorImpl;

public class testProveedor {

	public static void main(String[] args) {
		// INSTANCIAMOS
		TblProveedorcl2 provEntity = new TblProveedorcl2();
		ProveedorImpl provDao = new ProveedorImpl();

		//idProveedor	nomProveedor	rucProveedor	rSocialProveedor	emailProveedor	fecIngresoProveedor
		//REGISTRAR USUARIO ----------------------------------
		/*provEntity.setNomProveedor("Prov 7");
		provEntity.setRucProveedor("10525252777");
		provEntity.setRSocialProveedor("Prov7 SAC");
		provEntity.setEmailProveedor("prov7@gmail.com");
			Date fecha=new Date();
			Date fechasql=new Date(fecha.getTime());
		provEntity.setFecIngresoProveedor(fechasql);
		
		provDao.RegistrarProveedor(provEntity);
		
		System.out.println("Dato registrado en la BD");*/
		
		//ACTUALIZAR USUARIO ----------------------------------
		/*provEntity.setIdProveedor(6);
		provEntity.setNomProveedor("Prov 50");
		provEntity.setRucProveedor("10525252000");
		provEntity.setRSocialProveedor("Prov50 SAC");
		provEntity.setEmailProveedor("prov50@gmail.com");
			Date fecha=new Date();
			Date fechasql=new Date(fecha.getTime());
		provEntity.setFecIngresoProveedor(fechasql);
		
		provDao.ActualizarProveedor(provEntity);
		
		System.out.println("Dato actualizado en la BD");*/
		
		//ELIMINAR USUARIO ----------------------------------
		/*provEntity.setIdProveedor(5);
		
		provDao.EliminarProveedor(provEntity);
		
		System.out.println("Dato eliminado de la BD");*/
		
		//LISTAR USUARIO ----------------------------------
		//idProveedor	nomProveedor	rucProveedor	rSocialProveedor	emailProveedor	fecIngresoProveedor
		/*List<TblProveedorcl2> listado = provDao.ListarProveedor();
		for(TblProveedorcl2 lis:listado){
			System.out.println("Id \t"+lis.getIdProveedor()+"\n"+
								"Nombre "+lis.getNomProveedor()+"\n"+
								"RUC "+lis.getRucProveedor()+"\n"+
								"Raz Social "+lis.getRSocialProveedor()+"\n"+
								"Email "+lis.getEmailProveedor()+"\n"+
								"Fec Ingres"+lis.getFecIngresoProveedor()+"\n \n");
		}*/
		
		//BUSCAR USUARIO ----------------------------------
		/*provEntity.setIdProveedor(3);
		
		TblProveedorcl2 pr = provDao.BuscarProveedor(provEntity);
		
		System.out.println("Id \t"+pr.getIdProveedor()+"\n"+
							"Nombre "+pr.getNomProveedor()+"\n"+
							"RUC "+pr.getRucProveedor()+"\n"+
							"Raz Social "+pr.getRSocialProveedor()+"\n"+
							"Email "+pr.getEmailProveedor()+"\n"+
							"Fec Ingres"+pr.getFecIngresoProveedor()+"\n \n");*/
		
	}

}
