name = "Aryan Bhatt"
roll_number = 2

print(f"Name: {name}")
print(f"Roll Number: {roll_number}")

print(type(name))
print(type(roll_number)) 

roll_number = float(roll_number)
print(roll_number)
print(type(roll_number)) # type is float since we type casted

name = bool(name)
print(name)
print(type(name)) # true since the string has characters

string = ""
print(string)
print(type(string))

string = bool(string)
print(string)
print(type(string)) # false since the string is empty