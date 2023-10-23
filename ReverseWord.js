// A. Reverse words in a sentence
function reverseWords(sentence) {
    return sentence.split(' ').map(word => word.split('').reverse().join('')).join(' ');
}

// B. Sort an array in descending order
function sortDescending(arr) {
    return arr.sort((a, b) => b - a);
}

// Example usage
const sentence = "This is a sunny day";
console.log("Reversed Sentence: " + reverseWords(sentence));

const numbers = [5, 2, 9, 1, 5];
console.log("Descending Sorted Array: " + sortDescending(numbers));
