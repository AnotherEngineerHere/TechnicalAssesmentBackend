import React, { useState, useEffect } from 'react';
import { Button, TextField, Typography, Box } from '@mui/material';
import axios from 'axios';

const ReservationComponent = () => {
    const [reservations, setReservations] = useState([]);
    const [newReservation, setNewReservation] = useState({});

    useEffect(() => {
        fetchReservations();
    }, []);

    const fetchReservations = async () => {
        try {
            const response = await axios.get('http://localhost:8080/reservations/');
            setReservations(response.data);
        } catch (error) {
            console.error('Error fetching reservations:', error);
        }
    };

    const handleCreateReservation = async () => {
        try {
            await axios.post('http://localhost:8080/reservations/', newReservation);
            setNewReservation({});
            fetchReservations();
        } catch (error) {
            console.error('Error creating reservation:', error);
        }
    };

    const handleCancelReservation = async (id) => {
        try {
            await axios.delete(`http://localhost:8080/reservations/${id}`);
            fetchReservations();
        } catch (error) {
            console.error('Error canceling reservation:', error);
        }
    };

    return (
        <div>
            <Typography variant="h4" gutterBottom>
                Reservations
            </Typography>
            <Box mb={2}>
                <TextField
                    label="Client ID"
                    value={newReservation.clientId || ''}
                    onChange={(e) => setNewReservation({ ...newReservation, clientId: e.target.value })}
                    fullWidth
                    variant="outlined"
                />
                <TextField
                    label="Screening ID"
                    value={newReservation.screeningId || ''}
                    onChange={(e) => setNewReservation({ ...newReservation, screeningId: e.target.value })}
                    fullWidth
                    variant="outlined"
                />
                <TextField
                    label="Number of Seats"
                    value={newReservation.numberOfSeats || ''}
                    onChange={(e) => setNewReservation({ ...newReservation, numberOfSeats: e.target.value })}
                    fullWidth
                    variant="outlined"
                />
                <Button variant="contained" color="primary" onClick={handleCreateReservation}>
                    Create Reservation
                </Button>
            </Box>
            <Typography variant="h6">Current Reservations:</Typography>
            <ul>
                {reservations.map((reservation) => (
                    <li key={reservation.id}>
                        Client ID: {reservation.clientId}, Screening ID: {reservation.screeningId}, Number of Seats:{' '}
                        {reservation.numberOfSeats}
                        <Button variant="outlined" color="secondary" onClick={() => handleCancelReservation(reservation.id)}>
                            Cancel
                        </Button>
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default ReservationComponent;
