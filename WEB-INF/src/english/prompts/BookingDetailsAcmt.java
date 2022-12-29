/**
 * Last generated by Orchestration Designer at: 2022-DEC-07  02:57:19 PM
 */
package english.prompts;

public class BookingDetailsAcmt extends com.avaya.sce.runtime.Prompt {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Constructor for BookingDetailsAcmt.
	 */
	public BookingDetailsAcmt() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}


	/**
	 * This method is generated automatically and should not be manually edited
	 * To manually edit the prompt, override:
	 * void updatePrompt()
	 * Last generated by Orchestration Designer at: 2022-DEC-28  06:42:15 PM
	 */
	public void buildPrompt(){
		com.avaya.sce.runtime.Format format = null;
		com.avaya.sce.runtime.RenderHint hint = null;
		com.avaya.sce.runtime.MediaPage mediaPage = null;
		setBarginType(com.avaya.sce.runtimecommon.SCERT.BARGIN_SPEECH);
		setName("BookingDetailsAcmt");
		setOrder(com.avaya.sce.runtime.Prompt.STANDARD);

		// Prompt level 1
		setTimeout(1,8000);
		setBargin(1,true);

		add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"English:BookingNoIs",false));

		format = new com.avaya.sce.runtime.Format();
		format.add("format","digits");
		format.add("Inflection","Crmm");
		add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.VARIABLE_AUDIO,"BookingDetails:BookingNo",format,false));

		add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"English:NoOfPersonsIs",false));

		format = new com.avaya.sce.runtime.Format();
		format.add("format","digits");
		format.add("Inflection","Crmm");
		add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.VARIABLE_AUDIO,"GetNoPersonPC:value",format,false));

		add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"English:BookingDateTimeIs",false));

		format = new com.avaya.sce.runtime.Format();
		format.add("format","date");
		format.add("Month Type","spokenmonth");
		format.add("Date Format","DMSPDYY");
		add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.VARIABLE_AUDIO,"GetDatePC:value",format,false));

		format = new com.avaya.sce.runtime.Format();
		format.add("format","time");
		format.add("Time Format","TH24M");
		add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.VARIABLE_AUDIO,"GetTimePC:value",format,false));

		add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"English:BookingDurationIs",false));

		format = new com.avaya.sce.runtime.Format();
		format.add("format","number");
		format.add("Number Type","integer");
		format.add("inflection","Nn");
		add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.VARIABLE_AUDIO,"GetDurationPC:value",format,false));

	}
}
