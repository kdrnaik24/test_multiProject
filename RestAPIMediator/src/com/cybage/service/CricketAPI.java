package com.cybage.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.cybage.model.CallCricketAPI;
import com.cybage.model.Cricket;
import com.sun.jersey.api.core.HttpRequestContext;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
@Path("/cricket")
public class CricketAPI
{
	 
	 
	@GET
	@Path("/PlayerName/{name}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Cricket getPlayerDetails(@PathParam("name") String name)
	{
		System.out.println(name);
		CallCricketAPI obj=new CallCricketAPI();
		Cricket details=obj.getPlayerDetail(name);
		return details;
	}
	
	@POST
	@Path("/Details")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Cricket getDetails(Cricket obj,@Context HttpServletRequest request)
	{
		Cricket obj1=new Cricket();
		obj1.setPlayerName("jitan");
		obj1.setIplScore(1000);
		obj1.setOneDayScore(2000);
		obj1.setTestScore(5000);
		
		if(request.getContentType().equals(MediaType.APPLICATION_XML))
		{
			System.out.println("data recieve in xml");
			System.out.println(obj);
			
			
		}
		else if(request.getContentType().equals(MediaType.APPLICATION_JSON))
		{
			System.out.println("data recieve in json");
			System.out.println(obj);
			
			
		}
		return obj1;
	}
	
}
