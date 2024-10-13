package interfaces;

import java.util.List;
import model.TblUsuariocl2;

public interface IUsuario {
	//DECLARAR MÉTODOS
	void RegistrarUsuario(TblUsuariocl2 user);
	void ActualizarUsuario(TblUsuariocl2 user);
	void EliminarUsuario(TblUsuariocl2 user);
	List<TblUsuariocl2> ListarUsuario();
	TblUsuariocl2 BuscarUsuario(TblUsuariocl2 user);
}
