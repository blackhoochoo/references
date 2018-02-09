package com.hoochootong.references;


public class Enum {
	public enum AGENT_NAME {ID_DELIVER, OTHER};
	private AGENT_NAME agentName;
	
	
	
	public Enum() {
		super();
		// TODO Auto-generated constructor stub
	}



	public AGENT_NAME getAgentName() {
		return agentName;
	}



	public void setAgentName(AGENT_NAME agentName) {
		this.agentName = agentName;
	}



	public static void main(String[] args) {
		Enum enom = new Enum();
		enom.setAgentName(Enum.AGENT_NAME.ID_DELIVER);
		System.out.println(enom.getAgentName().equals(Enum.AGENT_NAME.OTHER));
	}
}
