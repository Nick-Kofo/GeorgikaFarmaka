package com.pkm.georgikafarmaka;
public class Question_4 {
	private int ID_4;
	private String QUESTION_4;
	private String OPTA_4;
	private String OPTB_4;
	private String OPTC_4;
	private String OPTD_4;
	private String ANSWER_4;
	public Question_4()
	{
		ID_4=0;
		QUESTION_4="";
		OPTA_4="";
		OPTB_4="";
		OPTC_4="";
		OPTD_4="";
		ANSWER_4="";
	}
	public Question_4(String qUESTION_4, String oPTA_4, String oPTB_4, String oPTC_4, String oPTD_4,
			String aNSWER_4) {
		
		QUESTION_4 = qUESTION_4;
		OPTA_4 = oPTA_4;
		OPTB_4 = oPTB_4;
		OPTC_4 = oPTC_4;
		OPTD_4 = oPTD_4;
		ANSWER_4 = aNSWER_4;
	}
	public int getID_4()
	{
		return ID_4;
	}
	public String getQUESTION_4() {
		return QUESTION_4;
	}
	public String getOPTA_4() {
		return OPTA_4;
	}
	public String getOPTB_4() {
		return OPTB_4;
	}
	public String getOPTC_4() {
		return OPTC_4;
	}
	public String getOPTD_4() {
		return OPTD_4;
	}
	public String getANSWER_4() {
		return ANSWER_4;
	}
	public void setID_4(int id_4)
	{
		ID_4=id_4;
	}
	public void setQUESTION_4(String qUESTION_4) {
		QUESTION_4 = qUESTION_4;
	}
	public void setOPTA_4(String oPTA_4) {
		OPTA_4 = oPTA_4;
	}
	public void setOPTB_4(String oPTB_4) {
		OPTB_4 = oPTB_4;
	}
	public void setOPTC_4(String oPTC_4) {
		OPTC_4 = oPTC_4;
	}
	public void setOPTD_4(String oPTD_4) {
		OPTD_4 = oPTD_4;
	}
	public void setANSWER_4(String aNSWER_4) {
		ANSWER_4 = aNSWER_4;
	}
	
}
