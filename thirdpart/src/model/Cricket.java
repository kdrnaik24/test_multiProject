package model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cricket implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private String playerName;
	private int iplScore;
	private int testScore;
	private int oneDayScore;
	
	
	
	@XmlElement
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	@XmlElement
	public int getIplScore() {
		return iplScore;
	}
	public void setIplScore(int iplScore) {
		this.iplScore = iplScore;
	}
	
	@XmlElement
	public int getTestScore() {
		return testScore;
	}
	
	public void setTestScore(int testScore) {
		this.testScore = testScore;
	}
	
	@XmlElement	
	public int getOneDayScore() {
		return oneDayScore;
	}
	public void setOneDayScore(int oneDayScore) {
		this.oneDayScore = oneDayScore;
	}
	@Override
	public String toString() {
		return "Cricketer [playerName=" + playerName + ", iplScore=" + iplScore + ", testScore=" + testScore
				+ ", odiScore=" + oneDayScore + "]";
	}
	
	
}
