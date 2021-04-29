import java.util.*;

public class VendingMachine {

	public static void main(String[] args) {
		Snack _chips = new Snack(1);
		Snack _soda = new Snack(2);
		Snack _cookies = new Snack(2);
		Snack _candy = new Snack(3);
		Snack _gum = new Snack(3);
		Snack _water = new Snack(4);
		Boolean _confirmed = false;
		int _change = 0;

		System.out.println("Welcome, this vending machine only accepts $1 bills. Type the amount of money you'd to like enter.");
		Scanner _input = new Scanner(System.in);
		int _balance = _input.nextInt();
		System.out.println("Press the number corresponding to the snack of your _selection.");
		System.out.println("Our snack selection goes as followed: Chips[1], Soda[2], Candy[3], Water[4], Gum[5], and Cookies[6]");
		int _selection = _input.nextInt();
		if ((_selection == 1) && (_balance < _chips.getPrice())) {
			System.out.println("Insufficient funds. Add additional $1 bills.");
			int _extraMoney = _input.nextInt();
			_balance+= _extraMoney;
		}
		else if ((_selection == 2) && (_balance < _soda.getPrice())) {
			System.out.println("Insufficient funds. Add additional $1 bills.");
			int _extraMoney = _input.nextInt();
			_balance+= _extraMoney;
		}
		else if ((_selection == 3) && (_balance < _candy.getPrice())) {
			System.out.println("Insufficient funds. Add additional $1 bills.");
			int _extraMoney = _input.nextInt();
			_balance+= _extraMoney;
		}
		else if ((_selection == 4) && (_balance < _water.getPrice())) {
			System.out.println("Insufficient funds. Add additional $1 bills.");
			int _extraMoney = _input.nextInt();
			_balance+= _extraMoney;
		}
		else if ((_selection == 5) && (_balance < _gum.getPrice())) {
			System.out.println("Insufficient funds. Add additional $1 bills.");
			int _extraMoney = _input.nextInt();
			_balance+= _extraMoney;
		}
		else if ((_selection == 6) && (_balance < _cookies.getPrice())) {
			System.out.println("Insufficient funds. Add additional $1 bills.");
			int _extraMoney = _input.nextInt();
			_balance+= _extraMoney;
		}

		switch(_selection) {
		case 1: _change = _balance - _chips.getPrice();
		break;
		case 2: _change = _balance - _soda.getPrice();
		break;
		case 3: _change = _balance - _candy.getPrice();
		break;		
		case 4: _change = _balance - _water.getPrice();
		break;	
		case 5: _change = _balance - _gum.getPrice();
		break;	
		case 6: _change = _balance - _cookies.getPrice();
		break;	
		}
		while (_confirmed == false)  {
			System.out.println("If you'd like to confirm your order press 1 otherwise press 2.");
			int _option = _input.nextInt();
			if (_option == 1) {
				System.out.println("Thank you for your transaction. Your order is confirmed. Your change is $" + _change + ".");
				_input.close();
				_confirmed = true;
			}
			else if (_option == 2) {
				System.out.println("Thank you for your transaction. You have cancelled your order. You have a refund of $" + _balance + ".");
				_input.close();
				_confirmed = true;
			}
			else {
				System.out.println("You must confirm or cancel your order.");

			}

		}

	}

}

