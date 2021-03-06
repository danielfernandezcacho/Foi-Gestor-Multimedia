/**
 * 
 */
package foi.gestormultimedia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import foi.gestormultimedia.dao.IArchivoDAO;
import foi.gestormultimedia.dao.IUsuarioDAO;
import foi.gestormultimedia.dto.Archivo;


/**
 * @author danif
 *
 */
@Service
public class ArchivoServiceImpl implements IArchivoService {

	@Autowired
	IArchivoDAO iArchivoDAO;
	
	@Override
	public List<Archivo> listarArchivo() {
		return iArchivoDAO.findAll();
	}

	@Override
	public Archivo guardarArchivo(Archivo archivo) {
		return iArchivoDAO.save(archivo);
	}

	@Override
	public Archivo archivoXID(int id) {
		return iArchivoDAO.findById(id).get();
	}

	@Override
	public Archivo actualizarArchivo(Archivo archivo) {
		return iArchivoDAO.save(archivo);
	}

	@Override
	public void eliminarArchivo(int id) {
		iArchivoDAO.deleteById(id);

	}

}
