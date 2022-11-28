package JavaLogical_Test_25_11;

public class Q11_Output {
	int count = 0;

	void A() throws  Exception {
		try {
			count++;

			try {
				count++;

				try {
					count++;
					throw new Exception();

				}

				catch (Exception ex) {
					count++;
					throw new Exception();
				}
			}

			catch (Exception ex) {
				count++;
			}
		}

		catch (Exception ex) {
			count++;
		}

	}

	void display() {
		System.out.println(count);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Q11_Output obj = new Q11_Output();
		obj.A();
		obj.display();

	}

}
