package deloitte.test.cache.encryption.utility;

import java.util.Collections;
import java.util.Map;

import org.apache.commons.collections.map.LRUMap;

public class DeloitteEncryptionCacheTestMainClass {
	private static final int MAX_CAPACITY = 5;
	
	private static Map<String, String> lruMapEncrypt = (Map<String, String>) Collections
			.synchronizedMap(new LRUMap(MAX_CAPACITY));
	
	private static Map<String, String> lruMapDecrypt = (Map<String, String>) Collections
			.synchronizedMap(new LRUMap(MAX_CAPACITY));
	
	public static void main(String[] args) {
		// Encrypt Names passed from Args
		System.out.println("encrypting " + args[0]);
		// Check availability in cache
		if (lruMapEncrypt.containsKey(args[0])) {
			// Cache has the value passed, return the encryptedName
			System.out.println(lruMapEncrypt.get(args[0])+" found in cache"  );
		} else {
			// Cache doesn't have the value passed : encrypt and store in to
			// if not in cache , add in cache
			lruMapEncrypt.put(args[0], encryptName(args[0]));
			System.out.println("adding to Cache");
			System.out.println("result = " + encryptName(args[0]));
		}
		//Retry as per requirement to verify cache
		if (lruMapEncrypt.containsKey(args[0])) {
			// Cache has the value passed, return the encryptedName
			System.out.println(args[0]+" found in cache");
			System.out.println("result = "+lruMapEncrypt.get(args[0]));
		} else {
			// Cache doesn't have the value passed : encrypt and store in to
			// if not in cache , add in cache
			lruMapEncrypt.put(args[0], encryptName(args[0]));
			System.out.println("adding to Cache");
			System.out.println("result = " + encryptName(args[0]));
		}
		// Setting the map for decrypt logic
		for(Map.Entry<String,String> entry: lruMapEncrypt.entrySet()){
			 //System.out.println(entry.getKey() + ": " + entry.getValue());
			 lruMapDecrypt.put(entry.getValue(),entry.getKey());
		}
		   
		System.out.println("\n dncrypting " + encryptName(args[0]) + "\n");
		
		if (lruMapDecrypt.containsKey(encryptName(args[0]))) {
			// Cache has the value passed, return the encryptedName
			System.out.println("i am found in cache ");
			System.out.println("result = "+lruMapDecrypt.get(encryptName(args[0])));
		} else {
			// Cache doesn't have the value passed : decrypt and store in to cache
			lruMapDecrypt.put(encryptName(args[0]),args[0]);
			System.out.println("adding to cache ");
			System.out.println("result = " + lruMapDecrypt.get(args[0]));
		}
		
		//Retry to verify cache of decryption
		if (lruMapDecrypt.containsKey(encryptName(args[0]))) {
			// Cache has the value passed, return the encryptedName
			System.out.println("i am found in cache ");
			System.out.println("result = "+lruMapDecrypt.get(encryptName(args[0])));
		} else {
			// Cache doesn't have the value passed : decrypt and store in to cache
			lruMapDecrypt.put(encryptName(args[0]),args[0]);
			System.out.println("adding to cache ");
			System.out.println("result = " + lruMapDecrypt.get(args[0]));
		}
	}

	public static String encryptName(String name) {
		String encryptedUserName = "";
		StringBuilder userName = new StringBuilder(name);
		int lenName = userName.length();
		if (lenName % 2 == 0) {
			// Even : 2 parts
			//System.out.println("userName   " + userName);
			encryptedUserName = userName.substring(lenName / 2, lenName) + userName.substring(0, lenName / 2);
			encryptedUserName = encryptedUserName.replaceAll("#", "");
			//System.out.println("Even: encryptedUserName ::-->" + encryptedUserName);
		} else {
			// Odd : 2 Parts after = "#"
			userName = userName.append("#");
			//System.out.println("userName   " + userName);
			encryptedUserName = userName.substring(lenName / 2 + 1, lenName + 1)
					+ userName.substring(0, lenName / 2 + 1);
			//encryptedUserName = encryptedUserName.replaceAll("#", "");
			//System.out.println("Odd: encryptedUserName ::-->" + encryptedUserName);
		}
		return encryptedUserName;
	}

	/*public static String decryptName(String name) {
		String encryptedUserName = "";
		StringBuilder userName = new StringBuilder(name);
		int lenName = userName.length();
		if (lenName % 2 == 0) {
			// Even : 2 parts
			System.out.println("userName   " + userName);
			encryptedUserName = userName.substring(lenName / 2, lenName) + userName.substring(0, lenName / 2);
			encryptedUserName = encryptedUserName.replaceAll("#", "");
			System.out.println("Even: encryptedUserName ::-->" + encryptedUserName);
		} else {
			// Odd : 2 Parts after = "#"
			userName = userName.append("#");
			System.out.println("userName   " + userName);
			encryptedUserName = userName.substring(lenName / 2 + 1, lenName + 1)
					+ userName.substring(0, lenName / 2 + 1);
			encryptedUserName = encryptedUserName.replaceAll("#", "");
			System.out.println("Odd: encryptedUserName ::-->" + encryptedUserName);
		}
		return encryptedUserName;
	}*/
}
