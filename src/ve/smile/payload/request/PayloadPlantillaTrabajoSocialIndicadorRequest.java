package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.PlantillaTrabajoSocialIndicador;
import lights.core.payload.request.IPayloadRequest;

public class PayloadPlantillaTrabajoSocialIndicadorRequest extends IPayloadRequest<PlantillaTrabajoSocialIndicador> {

	private List<PlantillaTrabajoSocialIndicador> objetos;

	private PlantillaTrabajoSocialIndicador objeto;

	public PayloadPlantillaTrabajoSocialIndicadorRequest() {
		super();
	}

	@Override
	public List<PlantillaTrabajoSocialIndicador> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<PlantillaTrabajoSocialIndicador> objetos) {
		this.objetos = objetos;
	}

	@Override
	public PlantillaTrabajoSocialIndicador getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(PlantillaTrabajoSocialIndicador objeto) {
		this.objeto = objeto;
	}

}
