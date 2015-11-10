package com.pkm.georgikafarmaka;
public class Question_5 {
	private int ID_5;
	private String QUESTION_5;
	private String OPTA_5;
	private String OPTB_5;
	private String OPTC_5;
	private String OPTD_5;
	private String ANSWER_5;
	public Question_5()
	{
		ID_5=0;
		QUESTION_5="";
		OPTA_5="";
		OPTB_5="";
		OPTC_5="";
		OPTD_5="";
		ANSWER_5="";
	}
	public Question_5(String qUESTION_5, String oPTA_5, String oPTB_5, String oPTC_5, String oPTD_5,
			String aNSWER_5) {
		
		QUESTION_5 = qUESTION_5;
		OPTA_5 = oPTA_5;
		OPTB_5 = oPTB_5;
		OPTC_5 = oPTC_5;
		OPTD_5 = oPTD_5;
		ANSWER_5 = aNSWER_5;
	}
	public int getID_5()
	{
		return ID_5;
	}
	public String getQUESTION_5() {
		return QUESTION_5;
	}
	public String getOPTA_5() {
		return OPTA_5;
	}
	public String getOPTB_5() {
		return OPTB_5;
	}
	public String getOPTC_5() {
		return OPTC_5;
	}
	public String getOPTD_5() {
		return OPTD_5;
	}
	public String getANSWER_5() {
		return ANSWER_5;
	}
	public void setID_5(int id_5)
	{
		ID_5=id_5;
	}
	public void setQUESTION_5(String qUESTION_5) {
		QUESTION_5 = qUESTION_5;
	}
	public void setOPTA_5(String oPTA_5) {
		OPTA_5 = oPTA_5;
	}
	public void setOPTB_5(String oPTB_5) {
		OPTB_5 = oPTB_5;
	}
	public void setOPTC_5(String oPTC_5) {
		OPTC_5 = oPTC_5;
	}
	public void setOPTD_5(String oPTD_5) {
		OPTD_5 = oPTD_5;
	}
	public void setANSWER_5(String aNSWER_5) {
		ANSWER_5 = aNSWER_5;
	}
	
}
