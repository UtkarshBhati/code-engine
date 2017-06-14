package deloitte.test.cache.encryption.utility;

public class EncryptDecryptUtilityClass {
	//Encryption logic
	//Split the name into two equal parts. 
	//if it is an odd number length, then add a # at the end of the name to make the length even.
	//Reverse the parts and concatenate back into one string
	String nameOfUser;
	boolean cachedEntry;
	
	public String encryptName(String name){
		String encryptedUserName = "";
		StringBuilder userName = new StringBuilder(name);
		int lenName = userName.length();
				if(lenName%2==0){
					//Even : 2 parts
					encryptedUserName =userName.substring(lenName/2+1,lenName)+ userName.substring(0, lenName/2);
					System.out.println("Even: encryptedUserName ::-->" + encryptedUserName);
				}
				else {
					//Odd : 2 Parts after = "#"
					userName = userName.append("#");
					System.out.println("userName   "+userName);
					encryptedUserName =userName.substring(lenName/2+1,lenName)+ userName.substring(0, lenName/2);
					System.out.println("Odd: encryptedUserName ::-->" + encryptedUserName);
				}
		return encryptedUserName;
	}
}
