# Check that the string passed obeys the following rules
# It is a valid bracket: (, [, {, }, ], )
# Each open bracket has a closed bracket
# Each bracket is closed in the correct order

# self is a separate instance
def isValid(self, s: str) -> bool:
    
    # Create a dictionary that maps left and right parentheses
    matches = {
        '(': ')',
        '[': ']',
        '{': '}'
    }
    
    stack = []
    
    for char in s:
        if char in matches:
            stack.append(char)
        else: 
            if ((len(stack) == 0) or matches[stack.pop()] != char):
                return False
    
    return (len(stack) == 0)

# Individual Test Checker
def check_test(result: bool, expected: bool, input_str: str, 
            test_num: int):
    if (result == expected):
        print(f"""You PASSED TEST {test_num}
        Input String: {input_str}
        Your Result: {result}
        Expected Result: {expected}""")
    else:            
        print(f"""You FAILED TEST {test_num}
        Input String: {input_str}
        Your Result: {result}
        Expected Result: {expected}""")

def Tests():
    # Test 1: Basic 
    test1_str = "()"
    check_test(isValid("", test1_str), True, test1_str, 1);

    # Test 2: Sequential Case
    test2_str = "()[]{}"
    check_test(isValid("", test2_str), True, test2_str, 2);


    # Test 3: More Left than Right Parentheses
    test3_str = "["
    check_test(isValid("", test3_str), False, test3_str, 3);
    
    # Test 4: Nested Case
    test4_str = "([{}])"
    check_test(isValid("", test4_str), True, test4_str, 4);

    # Test 5: If last test isEmpty, then this fails.
    test5_str = "[["
    check_test(isValid("", test5_str), False, test5_str, 5);


def main():
    print(f'Personal Test Suite for isValid')
    Tests()
    

if __name__ == '__main__':
    main()
