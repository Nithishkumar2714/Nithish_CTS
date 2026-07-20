import React,{useState} from "react";
function Counter() {
    const [count, setCount] = useState(0);
    const increment = () => {
        setCount(count + 1);
    };
    const decrement = () => {
        setCount(count - 1);
    };
    const sayHello = () => {
        alert("Hello! Have a Nice Day");
    };
    const incrementAndHello = () => {
        increment();
        sayHello();
    };
    const welcome = (msg) => {
        alert(msg);
    };
    const clickEvent = () => {
        alert("I was clicked");
    };
    return (
        <div>
            <h2>Counter : {count}</h2>
            <button onClick={incrementAndHello}>Increment</button>
            <button onClick={decrement}>Decrement</button>
            <br /><br />
            <button onClick={() => welcome("Welcome")}>
                Say Welcome
            </button>
            <br /><br />
            <button onClick={clickEvent}>
                Synthetic Event
            </button>
        </div>
    );
}
export default Counter;
