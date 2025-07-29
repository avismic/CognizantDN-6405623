import React from 'react';

// The Cart component receives the list of items as a prop.
// It is responsible for displaying the table structure.
export default class Cart extends React.Component {
  render() {
    return (
      <table>
        <thead>
          <tr>
            <th>Name</th>
            <th>Price</th>
          </tr>
        </thead>
        <tbody>
          {/* We use the map function to loop through each item passed in props  */}
          {this.props.item.map((item, index) => {
            return (
              <tr key={index}>
                {/* Accessing the itemname and price for each item [cite: 18, 19] */}
                <td>{item.itemname}</td>
                <td>${item.price.toLocaleString()}</td>
              </tr>
            );
          })}
        </tbody>
      </table>
    );
  }
}