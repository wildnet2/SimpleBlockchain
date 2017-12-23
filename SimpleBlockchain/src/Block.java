import java.util.Arrays;

public class Block {
	
	private int previousHash;
	private String[] transactions;
	
	private int blockHash;
	
	public Block(int previousHash, String[] transactions) {
		super();
		this.previousHash = previousHash;
		this.transactions = transactions;
		
		Object[] contents = {Arrays.hashCode(transactions)};
		this.blockHash = Arrays.hashCode(contents);
	}

	public int getPreviousHash() {
		return previousHash;
	}

	public void setPreviousHash(int previousHash) {
		this.previousHash = previousHash;
	}

	public int getBlockHash() {
		return blockHash;
	}

	public void setBlockHash(int blockHash) {
		this.blockHash = blockHash;
	}

	public String[] getTransaction() {
		return transactions;
	}

	public void setTransaction(String[] transaction) {
		this.transactions = transaction;
	}

}
