package com.pkm.georgikafarmaka;
public class Question_2 {
	private int ID_2;
	private String QUESTION_2;
	private String OPTA_2;
	private String OPTB_2;
	private String OPTC_2;
	private String OPTD_2;
	private String ANSWER_2;
	public Question_2()
	{
		ID_2=0;
		QUESTION_2="";
		OPTA_2="";
		OPTB_2="";
		OPTC_2="";
		OPTD_2="";
		ANSWER_2="";
	}
	public Question_2(String qUESTION_2, String oPTA_2, String oPTB_2, String oPTC_2, String oPTD_2,
			String aNSWER_2) {
		
		QUESTION_2 = qUESTION_2;
		OPTA_2 = oPTA_2;
		OPTB_2 = oPTB_2;
		OPTC_2 = oPTC_2;
		OPTD_2 = oPTD_2;
		ANSWER_2 = aNSWER_2;
	}
	public int getID_2()
	{
		return ID_2;
	}
	public String getQUESTION_2() {
		return QUESTION_2;
	}
	public String getOPTA_2() {
		return OPTA_2;
	}
	public String getOPTB_2() {
		return OPTB_2;
	}
	public String getOPTC_2() {
		return OPTC_2;
	}
	public String getOPTD_2() {
		return OPTD_2;
	}
	public String getANSWER_2() {
		return ANSWER_2;
	}
	public void setID_2(int id_2)
	{
		ID_2=id_2;
	}
	public void setQUESTION_2(String qUESTION_2) {
		QUESTION_2 = qUESTION_2;
	}
	public void setOPTA_2(String oPTA_2) {
		OPTA_2 = oPTA_2;
	}
	public void setOPTB_2(String oPTB_2) {
		OPTB_2 = oPTB_2;
	}
	public void setOPTC_2(String oPTC_2) {
		OPTC_2 = oPTC_2;
	}
	public void setOPTD_2(String oPTD_2) {
		OPTD_2 = oPTD_2;
	}
	public void setANSWER_2(String aNSWER_2) {
		ANSWER_2 = aNSWER_2;
	}
	
}
