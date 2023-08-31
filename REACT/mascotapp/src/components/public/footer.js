import React, { useState } from 'react';

const Footer = () => {
	const [click, setClicks] = useState(0);

	const year = new Date().getFullYear();
	const companyName = 'EGG Education';

	const handleClick = () => {
		console.log('holis');
	};
	return (
		<div className="container">
			<footer className="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
				<p className="col-md-4 mb-0 text-body-secondary">
					&copy; {year} {companyName}, Inc
				</p>

				<ul className="nav col-md-4 justify-content-end">
					<li className="nav-item">
						<a href="#" className="nav-link px-2 text-body-secondary">
							Home
						</a>
					</li>
					<li className="nav-item">
						<a href="#" className="nav-link px-2 text-body-secondary">
							Features
						</a>
					</li>
					<li className="nav-item">
						<a href="#" className="nav-link px-2 text-body-secondary">
							Pricing
						</a>
					</li>
					<li className="nav-item">
						<a href="#" className="nav-link px-2 text-body-secondary">
							FAQs
						</a>
					</li>
					<li className="nav-item">
						<a href="#" className="nav-link px-2 text-body-secondary">
							About
						</a>
					</li>
				</ul>
			</footer>
		</div>
	);
};

export default Footer;
