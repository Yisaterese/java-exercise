exchange_rate = float(input("enter exchange rate"))
number = float(input("enter 0 or 1 to convert dollars to RMD and vice versa"))
dollar_amount = float(input("enter dollar amount"))
amount_in_yuan = float(input("enter amount in RMB"))
float dollars_to_yuan = dollar_amount * exchange_rate
float yuan_to_dollar = amount_in_yuan / exchange_rate

if(number == 0)
 print(f"${dollar_amount}.1f is {amount_in_yuan}.1f yuan" )
if(number == 1)
 print(f"{amount_in_yuan}.1f is ${dollar_amount}ss.1f",)