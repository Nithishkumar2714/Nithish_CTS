function BookDetails() {
    const books = [
        "Java",
        "Python",
        "React"
    ];
    return (
        <div className={"box"}>
            <h2>Book Details</h2>
            {books.map((book, index) => (
                <p key={index}>{book}</p>
            ))}
        </div>
    );
}

export default BookDetails;