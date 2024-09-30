def sum_of_divisors(n):
    """Returns the sum of the proper divisors of n."""
    divisors_sum = 0
    for i in range(1, n // 2 + 1):
        if n % i == 0:
            divisors_sum += i
    return divisors_sum

def check_number_type(n):
    """Checks whether the number is abundant, perfect, or deficient."""
    if n <= 0:
        return "Please enter a positive integer."

    divisors_sum = sum_of_divisors(n)

    if divisors_sum == n:
        return f"{n} is a perfect number."
    elif divisors_sum > n:
        return f"{n} is an abundant number."
    else:
        return f"{n} is a deficient number."

# Example usage
try:
 
