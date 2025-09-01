# Homework 1

## Question 1

1. Register -  
   `A register is an area where data being processing is stored that on a CPU. They are most commonly found in 32 or 64 bit sizes`
2. Memory -  
   `Typically refers to RAM storage on a computer where temporary data is stored while in use. Short term memory.`
3. Disk -  
   `Refers to the hardrive of the computer where data is stored or long term use. Long term memory`

---

## Question 2

## `Bytes are typically the smallest addressable units of memory because computers group data into that size`

## Question 3

1. MiB - 2^20
2. MB - 10^6
3. GiB - 2^30
4. GB - 10^9
5. TiB - 2^40
6. TB - 10^12
7. PiB 2^50
8. PB - 10^15  
   `The binary base 2 measurements are based on the actual amount of bytes in a medium, while the decimal base 10 measurements are easier for humans to read and understand`

---

## Question 4

```
Byte's max decimal is equal to (2^(8-1))-1. This is because there are 8 bits in a byte and one is used for negativity (8-1). The number could be 0 so we include the -1 to account for that.

A short is equal to (2^(16-1))-1, two bytes of data / 16 bit signed

A char is (2^16)-1 since its unsigned/always positive. 16 bit unsigned

Int is (2^31)-1. 32 bit signed

Long is 64 bit signed

A float is a 32 bit data type where there is 1 sign bit, 8 control the scale of the number as an exponent, and 23 are the actual number although decimals 0 and 255 are reserved.The formula comes out to (2-2^-23)*2^127.

Double has 1 sign bit, 11 scale bits, and 52 number bits and equals (2-2^-52)*2^1023
```

---

## Question 5

[anything.java](./anything.java)  
`"Goodbye Space!"`

---

## Question 6

[Fibonacci.java](./Fibonacci.java)  
`call stack`

---

## Question 7

[eratosthenes.java](./eratosthenes.java)

1. `97 89 83 79 73 in 1.0965E-5 seconds`
2. `1073741789 1073741783 1073741741 1073741723 1073741719 in 18.236022787 seconds`
3. `No, i used an int for n and int is a 32 bit signed data type so it cannot store the decimal 2^32`

---

## Question 8

[byteReader.java](./byteReader.java)

1.
2.

```
3
5
7
9
11
13
15
17
19
21
23
25
27
29
31
...
406560409
406560411
406560413
406560415
406560417
406560419
406560421
406560423
406560425
406560427
406560429
406560431
406560433
406560435
406560437
in 0.277146457 seconds
```

3.

```
233
235
237
239
2311
2313
2315
2317
2319
2321
2323
2325
2327
2329
2331
...
23406560409
23406560411
23406560413
23406560415
23406560417
23406560419
23406560421
23406560423
23406560425
23406560427
23406560429
23406560431
23406560433
23406560435
23406560437
in 0.26645249 seconds
```

# ^^^^ I don't think this is right ^^^^
