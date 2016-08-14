package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.ContactoPortal;
import lights.core.payload.request.IPayloadRequest;

public class PayloadContactoPortalRequest extends IPayloadRequest<ContactoPortal> {

	private List<ContactoPortal> objetos;

	private ContactoPortal objeto;

	public PayloadContactoPortalRequest() {
		super();
	}

	@Override
	public List<ContactoPortal> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<ContactoPortal> objetos) {
		this.objetos = objetos;
	}

	@Override
	public ContactoPortal getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(ContactoPortal objeto) {
		this.objeto = objeto;
	}

}
