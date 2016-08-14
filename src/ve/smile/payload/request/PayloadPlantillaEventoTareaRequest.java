package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.PlantillaEventoTarea;
import lights.core.payload.request.IPayloadRequest;

public class PayloadPlantillaEventoTareaRequest extends IPayloadRequest<PlantillaEventoTarea> {

	private List<PlantillaEventoTarea> objetos;

	private PlantillaEventoTarea objeto;

	public PayloadPlantillaEventoTareaRequest() {
		super();
	}

	@Override
	public List<PlantillaEventoTarea> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<PlantillaEventoTarea> objetos) {
		this.objetos = objetos;
	}

	@Override
	public PlantillaEventoTarea getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(PlantillaEventoTarea objeto) {
		this.objeto = objeto;
	}

}
