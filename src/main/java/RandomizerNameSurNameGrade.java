import org.apache.commons.lang3.RandomStringUtils;

public class RandomizerNameSurNameGrade {

    public String randomName (){
        String firstLetterName = RandomStringUtils.randomAlphabetic(1).toUpperCase();
        String remainingLettersName = RandomStringUtils.randomAlphabetic(3,10).toLowerCase();
     return    firstLetterName+remainingLettersName;
    }

    public String randomSurname (){
        String firstLetterSurName = RandomStringUtils.randomAlphabetic(1).toUpperCase();
        String remainingLettersSurName = RandomStringUtils.randomAlphabetic(3,10).toLowerCase();
        return firstLetterSurName+remainingLettersSurName;
    }

    public int randomGrade (){
        String remainingLettersSurName = RandomStringUtils.random(1,false,true);
        return Integer.parseInt(remainingLettersSurName);
    }
}
