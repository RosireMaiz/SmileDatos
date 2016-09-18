package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.PlantillaTrabajoSocialActividad;
import lights.core.payload.request.IPayloadRequest;

public class PayloadPlantillaTrabajoSocialActividadRequest extends IPayloadRequest<PlantillaTrabajoSocialActividad> {

	private List<PlantillaTrabajoSocialActividad> objetos;

	private PlantillaTrabajoSocialActividad objeto;

	public PayloadPlantillaTrabajoSocialActividadRequest() {
		super();
	}

	@Override
	public List<PlantillaTrabajoSocialActividad> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<PlantillaTrabajoSocialActividad> objetos) {
		this.objetos = objetos;
	}

	@Override
	public PlantillaTrabajoSocialActividad getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(PlantillaTrabajoSocialActividad objeto) {
		this.objeto = objeto;
	}

}
