package com.cybage.model;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.ws.Service;

import com.cybage.model.Cricket;

public class CallCricketAPI
{
	public Cricket getPlayerDetail(String name)
	{
		Cricket obj=new Cricket();
		
		try 
		{
			/*String uri = "http://172.27.60.107:9091/thirdpart/rest/player/abc/"+name;*/
			String uri="http://localhost:9090/thirdpart/rest/player/name/"+name;
			URL url = new URL(uri);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Accept", "application/xml");
			JAXBContext jc = JAXBContext.newInstance(Cricket.class);
			InputStream xml = connection.getInputStream();
			 obj = (Cricket) jc.createUnmarshaller().unmarshal(xml);

			connection.disconnect();
			
			System.out.println("Ipl Score:"+obj.getIplScore());
			System.out.println("One Day Score:"+obj.getOneDayScore());
			System.out.println("Test Score:"+obj.getTestScore());
		}
			catch (MalformedURLException e) 
		{
			e.printStackTrace();
		}
			catch (IOException e) 
		{
			e.printStackTrace();
		}
			catch (JAXBException e)
		{
			e.printStackTrace();
		}
		return obj;
	}
}
