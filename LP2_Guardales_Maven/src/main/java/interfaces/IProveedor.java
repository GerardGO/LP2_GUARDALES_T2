package interfaces;

import java.util.List;

import model.TblProveedorcl2;

public interface IProveedor {
	//DECLARAR MÉTODOS
	void RegistrarProveedor(TblProveedorcl2 proveed);
	void ActualizarProveedor(TblProveedorcl2 proveed);
	void EliminarProveedor(TblProveedorcl2 proveed);
	List<TblProveedorcl2> ListarProveedor();
	TblProveedorcl2 BuscarProveedor(TblProveedorcl2 proveed);
}
