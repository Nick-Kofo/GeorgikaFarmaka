package com.pkm.georgikafarmaka;
public class Question_3 {
	private int ID_3;
	private String QUESTION_3;
	private String OPTA_3;
	private String OPTB_3;
	private String OPTC_3;
	private String OPTD_3;
	private String ANSWER_3;
	public Question_3()
	{
		ID_3=0;
		QUESTION_3="";
		OPTA_3="";
		OPTB_3="";
		OPTC_3="";
		OPTD_3="";
		ANSWER_3="";
	}
	public Question_3(String qUESTION_3, String oPTA_3, String oPTB_3, String oPTC_3, String oPTD_3,
			String aNSWER_3) {
		
		QUESTION_3 = qUESTION_3;
		OPTA_3 = oPTA_3;
		OPTB_3 = oPTB_3;
		OPTC_3 = oPTC_3;
		OPTD_3 = oPTD_3;
		ANSWER_3 = aNSWER_3;
	}
	public int getID_3()
	{
		return ID_3;
	}
	public String getQUESTION_3() {
		return QUESTION_3;
	}
	public String getOPTA_3() {
		return OPTA_3;
	}
	public String getOPTB_3() {
		return OPTB_3;
	}
	public String getOPTC_3() {
		return OPTC_3;
	}
	public String getOPTD_3() {
		return OPTD_3;
	}
	public String getANSWER_3() {
		return ANSWER_3;
	}
	public void setID_3(int id_3)
	{
		ID_3=id_3;
	}
	public void setQUESTION_3(String qUESTION_3) {
		QUESTION_3 = qUESTION_3;
	}
	public void setOPTA_3(String oPTA_3) {
		OPTA_3 = oPTA_3;
	}
	public void setOPTB_3(String oPTB_3) {
		OPTB_3 = oPTB_3;
	}
	public void setOPTC_3(String oPTC_3) {
		OPTC_3 = oPTC_3;
	}
	public void setOPTD_3(String oPTD_3) {
		OPTD_3 = oPTD_3;
	}
	public void setANSWER_3(String aNSWER_3) {
		ANSWER_3 = aNSWER_3;
	}
	
}
