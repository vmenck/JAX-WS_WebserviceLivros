package clazz.faults;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebFault;

@WebFault(targetNamespace="http://methods.clazz/exeptions/", name="UsuarioNaoAutorizado")
public class UsuarioNaoAutorizadoException extends Exception {

	public UsuarioNaoAutorizadoException(String string) {
		super(string);
	}
	
	public UsuarioFaultInfo getFaultInfo()
	{
		return new UsuarioFaultInfo(getMessage());
	}
	
	@XmlAccessorType(XmlAccessType.FIELD)
	public static class UsuarioFaultInfo
	{
		@XmlAttribute
		private String mensagem;
		private XMLGregorianCalendar data;
		
		public UsuarioFaultInfo(String mensagem){
			this.mensagem = mensagem;
			try{
				this.data = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
				this.data.setMillisecond(DatatypeConstants.FIELD_UNDEFINED);
				this.data.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
			}
			catch(DatatypeConfigurationException dtcex){
				throw new RuntimeException(dtcex);
			}
		}
		
		public UsuarioFaultInfo(){}
	}
}
