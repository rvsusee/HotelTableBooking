package english.phrasesets;

/**
 * This phraseset class will be automatically populated with data from the 
 * phraseset project file.  Manual edits should only be outside of the tag 
 * areas or overridden methods. 
 * Class created on: 
 * Last generated by Orchestration Designer at: 2022-DEC-28  06:40:05 PM
 */
public class English extends com.avaya.sce.runtime.Phraseset { 

	//{{START:CLASS:FIELDS
	private static final com.avaya.sce.runtime.Phraseset.PhraseMap PHRASE_MAP;
	//}}END:CLASS:FIELDS

	/**
	 * Static initializer
	 */
	static {
		//{{START:PHRASESET:STATIC

		// Create the phrase map, then populate with phrases
		PHRASE_MAP = new com.avaya.sce.runtime.Phraseset.PhraseMap(110);
		com.avaya.sce.runtime.Phrase phrase;

		// phrase: BookingDurationIs
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "BookingDurationIs", "BookingDurationIs.wav", ""); 

		// phrase: BookingNoIs
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "BookingNoIs", "BookingNoIs.wav", ""); 

		// phrase: BookingDateTimeIs
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "BookingDateTimeIs", "BookingDateAndTimeIs.wav", ""); 

		// phrase: NoOfPersonsIs
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "NoOfPersonsIs", "NoOfPersonsIs.wav", ""); 

		// phrase: BookingCancelFailed
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "BookingCancelFailed", "BookingCancelFailed.wav", ""); 

		// phrase: BookingCancelSuccess
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "BookingCancelSuccess", "BookingCancelSuccess.wav", ""); 

		// phrase: BookingConfirmed
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "BookingConfirmed", "BookingConfirm.wav", ""); 

		// phrase: BookingNoNotFound
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "BookingNoNotFound", "BookingNoNotFound.wav", ""); 

		// phrase: ForConfirmBooking
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ForConfirmBooking", "ForConfirmBooking.wav", ""); 

		// phrase: ForEditBookingDetails
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ForEditBookingDetails", "ForEditBooking.wav", ""); 

		// phrase: ForLastBookingDetails
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ForLastBookingDetails", "ForLastBookingDetails.wav", ""); 

		// phrase: ForNewBooking
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ForNewBooking", "ForNewBooking.wav", ""); 

		// phrase: NoInput
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "NoInput", "NoInput.wav", ""); 

		// phrase: NoMatch
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "NoMatch", "NoMatch.wav", ""); 

		// phrase: EnterBookingNo
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "EnterBookingNo", "EnterBookingNo.wav", ""); 

		// phrase: EnterDate
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "EnterDate", "EnterDate.wav", ""); 

		// phrase: EnterDuration
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "EnterDuration", "EnterDuration.wav", ""); 

		// phrase: EnterNoPerson
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "EnterNoPerson", "EnterNoPerson.wav", ""); 

		// phrase: EnterTime
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "EnterTime", "EnterTime.wav", ""); 

		// phrase: DateNoInput
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "DateNoInput", "DateNoInput.wav", ""); 

		// phrase: DurationNoInput
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "DurationNoInput", "DurationNoInput.wav", ""); 

		// phrase: NoPersonNoInput
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "NoPersonNoInput", "NoPersonNoInput.wav", ""); 

		// phrase: TimeNoInput
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "TimeNoInput", "TimeNoInput.wav", ""); 

		// phrase: DateNoMatch
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "DateNoMatch", "DateNoMatch.wav", ""); 

		// phrase: DurationNoMatch
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "DurationNoMatch", "DurationNoMatch.wav", ""); 

		// phrase: NoPersonNoMatch
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "NoPersonNoMatch", "NoPersonNoMatch.wav", ""); 

		// phrase: TimeNoMatch
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "TimeNoMatch", "NoMatch.wav", ""); 

		// phrase: ForCancelBooking
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ForCancelBooking", "ForCancelBooking.wav", ""); 

		// phrase: ForRepeatBookingDetails
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ForRepeatBookingDetails", "ForRepeatBookingDetails.wav", ""); 

		// phrase: ExitAcmt
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ExitAcmt", "ExitAcmt.wav", ""); 

		// phrase: ForChangeLanguage
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ForChangeLanguage", "ForChangeLanguage.wav", ""); 

		// phrase: ForExit
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ForExit", "ForExit.wav", ""); 

		// phrase: ForMainMenu
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ForMainMenu", "ForMainMenu.wav", ""); 

		// phrase: ForTransferToAgent
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ForTransferToAgent", "ForTransferToAgent.wav", ""); 

		// phrase: MoreInvalidChoice
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "MoreInvalidChoice", "MoreInvalidChoice.wav", ""); 

		// phrase: MoreInvalidValues
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "MoreInvalidValues", "MoreInvalidValues.wav", ""); 

		// phrase: SomethingWrong
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "SomethingWrong", "SometingWrong.wav", ""); 

		// phrase: TryAgainLater
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "TryAgainLater", "TryAgainLater.wav", ""); 

		// phrase: WaitingToTransferCallAgent
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "WaitingToTransferCallAgent", "WaitingToTransferCallAcmt.wav", ""); 

		// phrase: WelcomeAnnouncement
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "WelcomeAnnouncement", "WelcomeAnnouncement.wav", ""); 

		// phrase: AutoLanguage
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "AutoLanguage", "AutoLanguage.wav", ""); 

		// phrase: ChoosePreferedLanguage
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ChoosePreferedLanguage", "ChoosePreferredLanguage.wav", ""); 

		// phrase: ForEnglish
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ForEnglish", "ForEnglish.wav", ""); 

		// phrase: ForTamil
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ForTamil", "ForTamil.wav", ""); 

		// phrase: NoInputLanguageMenu
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "NoInputLanguageMenu", "NoInputLanguageMenu.wav", ""); 

		// phrase: NoMatchLanguageMenu
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "NoMatchLanguageMenu", "NoMatchLanguageMenu.wav", ""); 

		// phrase: WelcomeAcmtAu
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "WelcomeAcmtAu", "WelcomeAnnouncement.au", ""); 

		// phrase: PastDateAcmt
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "PastDateAcmt", "PastDateAcmt.wav", ""); 

		// phrase: NewCustomerEnterPin
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "NewCustomerEnterPin", "NewCustomerEnterPin.wav", ""); 

		// phrase: ExistingCustomerEnterPin
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ExistingCustomerEnterPin", "ExistCustomerEnterPin.wav", ""); 

		// phrase: WrongPin
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "WrongPin", "WrongPin.wav", ""); 

		// phrase: NoPin
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "NoPin", "NoPin.wav", ""); 

		// phrase: WrongPinExit
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "WrongPinExit", "WrongPinExit.wav", ""); 

		// phrase: NoInputPin
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "NoInputPin", "NoPinExit.wav", ""); 

		// phrase: NoPinExit
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "NoPinExit", "NoPinExit.wav", ""); 

		//}}END:PHRASESET:STATIC
	}
	/**
	 * Returns the Phrase with the given name.  To override the
	 * behavior and dynamically return a different Phrase object,
	 * override the method "hookGetPhrase(...)".
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 2023-FEB-06  12:40:07 PM
	 * @see com.avaya.sce.runtime.Phraseset#getPhrase(String) 
	 */ 
	public com.avaya.sce.runtime.Phrase getPhrase(String phraseName) {
		return(getPhrase(English.PHRASE_MAP, phraseName));
	}
}
