package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="consultarDetalhesPedidoResult")
public class ConsultarDetalhesPedidoResult {
	
	private boolean erro;
	private boolean protocolo;
	
	
	public boolean isErro() {
		return erro;
	}
	
	public void setErro(boolean erro) {
		this.erro = erro;
	}
	
	public boolean isProtocolo() {
		return protocolo;
	}
	
	public void setProtocolo(boolean protocolo) {
		this.protocolo = protocolo;
	}

	@Override
	public String toString() {
		return "ConsultarDetalhesPedidoResult [erro=" + erro + ", protocolo=" + protocolo + "]";
	}
	
	
	

}
