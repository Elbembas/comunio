package scraping;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ScrapingLoteriasApuestas {

	String url;
	String tablaQuiniela;
	String tituloTablaQuiniela;
	String partidosQuiniela;
	String resultadoPartidos;
	int cabecera;
	int fecha;
	int resultado;

	public ScrapingLoteriasApuestas(){
		this.url = "http://www.loteriasyapuestas.es/es/la-quiniela";
		this.tablaQuiniela = "ui-li-thumb";
		this.tituloTablaQuiniela = "tituloRegion";
		this.partidosQuiniela = "cuerpoRegionLeft";
		this.resultadoPartidos = "cuerpoRegionRight";
		this.cabecera = 3;
		this.fecha = 5;
		this.resultado = 7;
	}
	
	public String Scraping() throws IOException{
		Document web = Jsoup.connect(url).get();
		Elements divQuiniela = web.getElementsByClass(tablaQuiniela);
		
		String enlaceCabecera = "";

		
		for(int i=0; i < divQuiniela.get(4).parentNode().childNodes().size(); i++){
			divQuiniela.get(4).parentNode().childNode(i);
			
			if (i == 3) {
				System.out.println(divQuiniela.get(4).parentNode().childNode(i));
			} else if (i == 5) {
				System.out.println(divQuiniela.get(4).parentNode().childNode(i));
			} else if (i == 7) {
				System.out.println(divQuiniela.get(4).parentNode().childNode(i));
			}
		}

		return enlaceCabecera;
	}
}