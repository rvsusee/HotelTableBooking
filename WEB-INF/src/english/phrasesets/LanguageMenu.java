package english.phrasesets;

/**
 * This phraseset class will be automatically populated with data from the 
 * phraseset project file.  Manual edits should only be outside of the tag 
 * areas or overridden methods. 
 * Class created on: 
 * Last generated by Orchestration Designer at: 2022-DEC-07  12:30:47 PM
 */
public class LanguageMenu extends com.avaya.sce.runtime.Phraseset { 

	//{{START:CLASS:FIELDS
	private static final com.avaya.sce.runtime.Phraseset.PhraseMap PHRASE_MAP;
	//}}END:CLASS:FIELDS

	/**
	 * Static initializer
	 */
	static {
		//{{START:PHRASESET:STATIC

		// Create the phrase map, then populate with phrases
		PHRASE_MAP = new com.avaya.sce.runtime.Phraseset.PhraseMap(14);
		com.avaya.sce.runtime.Phrase phrase;

		// phrase: ForEnglish
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ForEnglish", "ForEnglish.wav", "For English"); 

		// phrase: ForTamil
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ForTamil", "ForTamil.wav", "For Tamil"); 

		// phrase: ForHindi
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ForHindi", "ForHindi.wav", "For Hindi"); 

		// phrase: AutoLanguage
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "AutoLanguage", "AutoLanguage.wav", "English is automatically selected"); 

		// phrase: NoInputLanguageMenu
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "NoInputLanguageMenu", "NoInputLanguageMenu.wav", "You have not selected Your preferred language"); 

		// phrase: ChoosePreferredLanguage
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ChoosePreferredLanguage", "ChoosePreferredLanguage.wav", "Choose Your Preferred Language"); 

		// phrase: NoMatchLanguageMenu
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "NoMatchLanguageMenu", "NoMatchLanguageMenu.wav", "You have Entered invalid option."); 

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
	 * Last generated by Orchestration Designer at: 2022-DEC-08  06:00:03 PM
	 * @see com.avaya.sce.runtime.Phraseset#getPhrase(String) 
	 */ 
	public com.avaya.sce.runtime.Phrase getPhrase(String phraseName) {
		return(getPhrase(LanguageMenu.PHRASE_MAP, phraseName));
	}
}