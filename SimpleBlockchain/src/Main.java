import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays; 
import java.util.Calendar;
import java.util.Date;

public class Main {
	/**
	 * Hash = digital signature
	 * 
	 * Each block will have:
	 * 	List of transactions
	 * 	Previous Hash
	 * 	Hash
	 * 
	 */
	
	ArrayList<Block> blockchain = new ArrayList<>();
	public static void main(String[] args){
		
		String[] genesisTransactions = {"aggA send 1 BTC to B"};
		Block genesisBlock = new Block(0, genesisTransactions);
		
		String[] block2Transactions = {"B send 0,4 BTC to C"};
		Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);
		
		String[] block3Transactions = {"C send 10000 BTC to A"};
		Block block3 = new Block(block2.getBlockHash(), block3Transactions);
		
		System.out.println("Hash of genesis block: ");
		System.out.println(genesisBlock.getBlockHash());
		System.out.println("Hash of second block: ");
		System.out.println(block2.getBlockHash());
		System.out.println("Hash of third block: ");
		System.out.println(block3.getBlockHash());
	}
}


