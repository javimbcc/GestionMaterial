package DTOs;

import alumnos.material.dao.Ordenador;

public class OrdenadorToDTO {

	public static OrdenadorDTO ordenadorToDto(Ordenador pc) {
		OrdenadorDTO pcDTO = new OrdenadorDTO(pc.getIdentificador(), pc.getMarca(), pc.getModelo());
		return pcDTO;
	}

}
