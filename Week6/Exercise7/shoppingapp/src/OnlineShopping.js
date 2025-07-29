import React from 'react';
import Cart from './Cart'; // Importing the Cart component

// The OnlineShopping component holds the state/data for our application.
export default class OnlineShopping extends React.Component {
  render() {
    // Here we create an array of cart items as requested 
    const CartInfo = [
      { itemname: "Laptop", price: 80000 },
      { itemname: "TV", price: 120000 },
      { itemname: "Washing Machine", price: 50000 },
      { itemname: "Mobile", price: 30000 },
      { itemname: "Fridge", price: 70000 }
    ];

    return (
      // We use a div with a className for styling purposes.
      <div className="mydiv">
        <h1>Items Ordered :</h1>
        {/* Here we render the Cart component and pass the CartInfo array as a prop [cite: 8] */}
        <Cart item={CartInfo} />
      </div>
    );
  }
}