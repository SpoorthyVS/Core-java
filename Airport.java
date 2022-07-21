interface Airport{


	public boolean createTerminal(TerminalDTO terminal);
	public void getTerminalDetails();
	public boolean updateLoadingBridgeById(int id, int noOfLoadingBridges);
	public boolean updateNoOfCheckInCoountersByName(String name, int noOfCheckIncounters);
	public boolean deleteTerminalsByName(String name);
	public boolean deleteTerminalsById(int id);


}