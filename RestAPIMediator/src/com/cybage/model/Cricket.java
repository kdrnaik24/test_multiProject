package com.cybage.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
/*@XmlType(propOrder={"testScore","playerName","iplScore","oneDayScore"})*/
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class Cricket implements Serializable
{

	private static final long serialVersionUID = 1L;
	
	private String playerName;
	private int iplScore;
	private int testScore;
	private int oneDayScore;
	
	
	
	public String getPlayerName()
	{
		return playerName;
	}
	public void setPlayerName(String playerName)
	{
		this.playerName = playerName;
	}
	public int getIplScore()
	{
		return iplScore;
	}
	public void setIplScore(int iplScore)
	{
		this.iplScore = iplScore;
	}
	
	public int getTestScore()
	{
		return testScore;
	}
	
	public void setTestScore(int testScore)
	{
		this.testScore = testScore;
	}
	public int getOneDayScore()
	{
		return oneDayScore;
	}
	public void setOneDayScore(int oneDayScore)
	{
		this.oneDayScore = oneDayScore;
	}
	@Override
	public String toString()
	{
		return "Cricket [playerName=" + playerName + ", iplScore=" + iplScore + ", testScore=" + testScore
				+ ", oneDayScore=" + oneDayScore + "]";
	}
	
}
