package exercicio.dois;

public class Converter {
	public static String Converter(double seg) {
		
		if(seg < 60) {
			return String.format("00:00:%02d", seg);
		}else if(seg < 3600) {
			int minuto = (int)seg/60;
			
			double rest = 60*((seg/60) - (int)seg/60);
			
			if(rest - (int)rest > 0.9) {
				rest = rest +1;
			}
			
			return String.format("00:%02d:%02d", minuto,(int)rest);
		}else {
			int hora = (int)seg/3600;
			
			double rest = seg % 3600;
			if(rest >= 60) {
				
				double segg = rest % 60; 
				
			}
			
			
			
			
			
			return String.format("%02d:00:%02d", hora, (int)segg);
		
		} 
	}
}
